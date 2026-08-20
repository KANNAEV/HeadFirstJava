# Java Stream API - потоковая обработка коллекций

- Состоит из потока, промежуточных операций и терминальной операции
- Минимально наличие потока и терминальной операции (vмаксимум по 1)
- Промежуточных операций может быть много
- Потоки не изменяют передаваемую ей коллекцию

---

- Lambda выражения - это объекты
- Выполняются при вызове их интерфейса с одним абстрактным методом (SAM)
- Т.е ссылка на lambda выражение ведет на функциональный интерфейс
- Для многострочных lambda выражений обязательны {фигурные скобки; и return}

---

- Некоторые виды функциональных интерфейсов, используемых lambda

```java
// 1. Runnable - без аргументов, без возврата
@FunctionalInterface
public interface Runnable {
    void run(); // Нет параметров, нет возвращаемого значения
}

// Consumer<T> - принимает аргумент, ничего не возвращает
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t); // Принимает T, ничего не возвращает
}

// Supplier<T> - ничего не принимает, возвращает значение
@FunctionalInterface
public interface Supplier<T> {
    T get(); // Нет параметров, возвращает T
}

// Function<T, R> - принимает T, возвращает R
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t); // // Принимает T, возвращает R
}

// Predicate<T> - проверяет условие, возвращает boolean
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);  // Принимает T, возвращает boolean
}

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);  // Сравнивает два объекта

    // Много default методов для цепочек сравнения
}

```

---

#### Способы сбора результата методом collect

- `Collectors.toList`/`toUnmodifiableList` - в список/ неизменяемый список
- `Collectors.toSet`/`toUnmodifiableSet` - в множество / неизменяемый множество
- `Collectors.toMap`/`toUnmodifiableMa` - в словарь / неизменяемый словарь
- `Collections.joining` - в String, можно задать разделитель между элементами

#### Другие методы терминальных операций

- anyMatch(Predicate p), allMatch(Predicate p), noneMatch(Predicate p); - возвращают логическое выражение наличия
  соответствий
- findAny(), findFirst(), max(Comparator c), min(Comparator c), reduce(BinaryOperator a) - поиск конкретного элемента
  возвращает Optional
- count() - возвращает количество элементов в потоке дынных в формате long
- [Stream API (Java 17)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html)

# P.S.

- Хороший тон - отмечать функциональные интерфейса аннотацией `@FunctionalInterface`
- Раньше интерфейсы содержали только абстрактные классы: которые нужно было переопределять
- В Java 8 появились `default` и `static` методы
- `static` методы не привязаны к экземпляру класса
- `default` методы содержат реализацию и наследуются подклассами
- Любой метод в интерфейсе, не помеченный как `default` и `static` считается абстрактным и подлежит переопределению

- Optional<T> — это класс-обертка, который может либо содержать значение (не null), либо быть пустым (Optional.empty()).
  Предотвращает от `NullPointerException` . Всегда проверяй на наличие результата через `isPresent()` 