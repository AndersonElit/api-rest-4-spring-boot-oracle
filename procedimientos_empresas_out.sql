CREATE PACKAGE procedimientos_empresas_out
IS
    PROCEDURE insertar_empresa(empresa IN VARCHAR2, respuesta OUT VARCHAR2);
END;
/
CREATE PACKAGE BODY procedimientos_empresas_out
IS

    --FUNCION INSERTAR EMPRESA
    FUNCTION insertar_empresa (nombre_empresa VARCHAR2)
    RETURN VARCHAR2
    IS
        respuesta VARCHAR2(100);
    BEGIN
        INSERT INTO empresas (nombre) VALUES (nombre_empresa);
        respuesta := 'EMPRESA-INSERTADA';
        RETURN respuesta;
    EXCEPTION
        --ORA-00001: restricción única (SYSTEM.SYS_C0011233) violada
        WHEN DUP_VAL_ON_INDEX THEN
            respuesta := 'EMPRESA-EXISTE';
            RETURN respuesta;
    END insertar_empresa;
    
    --PROCEDIMIENTO INSERTAR EMPRESA
    PROCEDURE insertar_empresa(empresa IN VARCHAR2, respuesta OUT VARCHAR2)
    AS
    BEGIN
         respuesta := insertar_empresa(empresa);
    END insertar_empresa;    
    
END;