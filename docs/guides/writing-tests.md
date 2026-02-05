# Как писать тесты

## Unit-тесты
- Покрывают один класс
- Без Spring-контекста
- Используйте Mockito для моков

## Интеграционные тесты
- Аннотация `@SpringBootTest`
- Запускают контекст приложения
- Используйте `@Testcontainers` для БД

Пример:
```java
@SpringBootTest
class MyServiceIntegrationTest {
    // ...
}