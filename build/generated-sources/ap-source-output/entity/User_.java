package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-11T21:12:20")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Integer> idUsuario;
    public static volatile SingularAttribute<User, String> apellido;
    public static volatile SingularAttribute<User, Date> fechaCreacion;
    public static volatile SingularAttribute<User, String> nombre;
    public static volatile SingularAttribute<User, String> email;

}