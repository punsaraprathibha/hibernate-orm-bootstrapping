# This is a basic application for hibernate bootstrapping.

### What we've covered so far;

1. How to perform hibernate configuration through a xml file (hibernate.cfg.xml).

2. How to configure a Session Factory with following steps (Native Bootstrapping)
*     1. Crearing a Service Registry
*     2. Creating a Metadata Object
*     3. Creating a Session Factory
*     4. Creating a Session Object

3. How to write CRUD operations with Hibernate
*     1. save()
*     2. update()
*     3. delete()
*     4. get()

4. What are Hibernate Annotation Types and their Usages
*     1. @Entity
*     2. @Table
*     3. @Id
*     4. @Column
*     5. @GeneratedValue [We've discussed all the Generation Types as well Eg:- (GenerationType.IDENTITY)]
*     6. @ElementCollection
*     7. @CollectionTable
*     8. @Transient
*     9. @CreationTimestamp
*     10.@Embeddable

5. What are the state types in Hibernate life cycle.
*     1. Transient
*     2. Persistent
*     3. Detached
*     4. Removed

### Now we're working with hibernate 5.6.5 which you may've to import as a library separately.