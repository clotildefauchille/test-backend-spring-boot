package springbackend.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Ce gestionnaire est responsable de la gestion de l'état des entités et de leur persistance dans la base de données
//bean : Un objet Java de type POJO (une classe Java qui n'implémente aucune interface particulière ni n'hérite d'aucune classe mère spécifique) mappé vers une table de la base de données grâce à des méta data via l'API Java Persistence
//https://www.jmdoudoux.fr/java/dej/chap-jpa.htm#:~:text='annotation%20%40javax.-,persistence.,la%20classe%20de%20l'entit%C3%A9.
//JPA permet de définir des entités (entities). Une entité est simplement une instance d’une classe qui sera persistante (que l’on pourra sauvegarder dans / charger depuis une base de données relationnelle). Une entité est signalée par l’annotation @Entity sur la classe. De plus, une entité JPA doit disposer d’un ou plusieurs attributs définissant un identifiant grâce à l’annotation @Id. Cet identifiant correspondra à la clé primaire dans la table associée.
//https://gayerie.dev/epsi-b3-orm/javaee_orm/jpa_entites.html
// @Entity
// Définit qu’une classe est une entité. Le nom de l’entité est donné par l’attribut name (en son absence le nom de l’entité correspond au nom de la classe).
@Entity
// @Table
// Permet de définir les informations sur la table représentant cette entité en base de données. Il est possible de définir le nom de la table grâce à l’attribut name. Par défaut le nom de la table correspond au nom de l’entité (qui par défaut correspond au nom de la classe).
@Table(name = "users")

public class User {
    //@Id
// Définit l’attribut qui sert de clé primaire dans la table. Il est recommandé au départ d’utiliser un type primitif, un wrapper de type primitif ou une String pour représenter un id. Pour les clés composites, la mise en œuvre est plus compliquée. Afin de ne pas se compliquer inutilement la tâche, il vaut mieux prévoir une clé simple pour chaque entité.
    @Id
    //@GeneratedValue
// Indique la stratégie à appliquer pour la génération de la clé lors de l’insertion d’une entité en base. Les valeurs possibles sont données par l’énumération GenerationType. Si vous utilisez MySQL et la propriété autoincrement sur une colonne, alors vous devez utiliser GenerationType.IDENTITY (ce sera le cas pour les exemples de ce cours). Si vous utilisez Oracle et un système de séquence, alors vous devez utiliser GenerationType.SEQUENCE et préciser le nom de la séquence dans l’attribut generator de @GeneratedValue. indique id auto-incrémentée
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column
// Permet de déclarer des informations relatives à la colonne sur laquelle un attribut doit être mappé. Si cette annotation est absente, le nom de la colonne correspond au nom de l’attribut. Avec cette annotation, il est possible de donner le nom de la colonne (l’attribut name) 
    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    private String email;
    public User() {
        
    }

    public User(String firstName, String lastName, String email){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
