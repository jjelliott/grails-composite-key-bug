# Composite Key bug

GORM for Hibernate 5 7.0.1 throws a NPE when attempting to sort a domain with a composite key.

## Steps to recreate:

Run example application, go to http://localhost:8081/compositeKey, exception will occur.
