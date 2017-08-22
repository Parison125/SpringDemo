Annotations seen so far.

@Required : use this on a setter method to notify the bean factory that
the concerned member variable (whose value is to be injected) is required.
An exception is thrown during bean initialization if the property is not set

@Autowired : use this on a setter to inject bean by type. If
several beans have the same type as expected, it tries to find
the bean by name. If no bean found, throws an exception

@Qualifier : use to "give some clues" to spring in order
for it to know which bean to inject. By exemple, if used with Autowired,
in case several beans have the same type as the expected bean, we can use @Qualifier
to indicates the bean we want to inject. Eg @Qualifier("Index").
The bean in the xml configuration file must have <qualifier value="Index" /> declared.

@Resource: JSR-250 standard annotation (not from spring), like Autowired.
Use this to inject bean by name eg : @Resource(name="beanId").
If no name is specified, it tries to find a bean with same name as the
setter.

@PostContruct : JSR-250 standard annotation (not from spring).
Specify an initialization method of a bean. This method is call after
the bean is being initialized by the bean factory

@PreDestroy : JSR-250 standard annotation (not from spring).
Specify a destruction method of a bean. This method is call before
the bean is  removed by the bean factory. Need to resgister
shutdown hook to the applicationContext in order for this method to be called