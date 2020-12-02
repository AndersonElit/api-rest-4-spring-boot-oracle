CREATE PACKAGE procedimientos_empresas_out
IS
    PROCEDURE insertar_empresa(empresa IN VARCHAR2, respuesta OUT VARCHAR2, new_id OUT NUMBER);
    PROCEDURE buscar_empresa(id_emp IN NUMBER, empresa OUT VARCHAR2);
    PROCEDURE eliminar_empresa(id_emp IN NUMBER, respuesta OUT VARCHAR2);
    PROCEDURE editar_empresa(id_emp IN NUMBER, nuevo_nombre IN VARCHAR2, respuesta OUT VARCHAR2);
    PROCEDURE reporte_por_empresa(nombre_emp IN VARCHAR2, numero_clientes OUT NUMBER);
END;
/
CREATE PACKAGE BODY procedimientos_empresas_out
IS

    --PROCEDIMIENTO BUSCAR EMPRESA
    PROCEDURE buscar_empresa(id_emp IN NUMBER, empresa OUT VARCHAR2)
    AS
    BEGIN
        SELECT  nombre INTO empresa FROM empresas WHERE id_empresa = id_emp;      
    END buscar_empresa;
    
    --PROCEDIMIENTO INSERTAR EMPRESA
    PROCEDURE insertar_empresa(empresa IN VARCHAR2, respuesta OUT VARCHAR2, new_id OUT NUMBER)
    AS
    BEGIN
         INSERT INTO empresas (nombre) VALUES (empresa);
         SELECT SECUENCIA_EMPRESAS.CURRVAL INTO new_id FROM DUAL;
         respuesta := 'EMPRESA-INSERTADA';
    EXCEPTION
        --ORA-00001: restricción única (SYSTEM.SYS_C0011233) violada
        WHEN DUP_VAL_ON_INDEX THEN
            respuesta := 'EMPRESA-EXISTE';
            SELECT id_empresa INTO new_id FROM empresas WHERE nombre = empresa;
    END insertar_empresa;
    
    --PROCEDIMIENTO ELIMINAR EMPRESA
    PROCEDURE eliminar_empresa(id_emp IN NUMBER, respuesta OUT VARCHAR2)
    AS
        integrity_err EXCEPTION;
        PRAGMA EXCEPTION_INIT (integrity_err, -2292);
        contar_e NUMBER;
    BEGIN
        --eliminar empresa
        SELECT COUNT(*) INTO contar_e FROM empresas WHERE id_empresa = id_emp;
        IF contar_e = 0 THEN
            respuesta := 'EMPRESA-NO-EXISTE';
        ELSE
            DELETE FROM empresas WHERE id_empresa = id_emp;
            respuesta := 'EMPRESA-ELIMINADA';
        END IF;
    EXCEPTION
        --ORA-02292: restricción de integridad (SYSTEM.SYS_C0011234) violada - registro secundario encontrado
        WHEN integrity_err THEN
            respuesta := 'USUARIO-ASOCIADO';
    END eliminar_empresa;
    
    --PROCEDIMIENTO EDITAR EMPRESA
    PROCEDURE editar_empresa(id_emp IN NUMBER, nuevo_nombre IN VARCHAR2, respuesta OUT VARCHAR2)
    AS
        integrity_err EXCEPTION;
        PRAGMA EXCEPTION_INIT (integrity_err, -2292);
    BEGIN
        UPDATE empresas SET nombre =  nuevo_nombre WHERE id_empresa = id_emp;
        respuesta := 'EMPRESA-ACTUALIZADA';
    /*
    EXCEPTION
        --ORA-02292: restricción de integridad (SYSTEM.SYS_C0011234) violada - registro secundario encontrado
        WHEN integrity_err THEN
            respuesta := 'USUARIO(S) ASOCIADO(S)';
        --ORA-00001: restricción única (SYSTEM.SYS_C0011233) violada
        WHEN DUP_VAL_ON_INDEX THEN
            respuesta := 'VALOR-DUPLICADO';
    */
    END editar_empresa;
    
    PROCEDURE reporte_por_empresa(nombre_emp IN VARCHAR2, numero_clientes OUT NUMBER)
    AS
    BEGIN
        SELECT COUNT(*) INTO numero_clientes FROM clientes WHERE empresa = nombre_emp;
    END;
    
END;