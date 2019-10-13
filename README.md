# Dagger2 
Dagger2(Android and Java) is constructed by google can be used with Kotlin

Mostly we have to use Constructor Injection as much as possible.

For field injection
1. cannot use AppCompatActivity
2. if later we have different activity, then need to create different inject method (Name of method doesn't matter)

If we are using 3rd party libraries then we won't be able to use constructor or method or field injection in this case we have to use MODULES and PROVIDERS.
