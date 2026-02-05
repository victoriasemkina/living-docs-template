# Именование тестов

Следуйте шаблону:
```text
{methodUnderTest}{scenario}{expectedBehavior}
```
Пример:
```java
void calculateTotal_emptyCart_returnsZero()
```
Избегайте:
- `test1`, `testSomething` — непонятно, что тестируется