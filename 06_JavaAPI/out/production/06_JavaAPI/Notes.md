# Использование библиотеки JAVA
- Java API — это огромная библиотека готовых классов и методов, которые встроены в Java.
- Документация размещена на сайте https://docs.oracle.com/en/java/javase/17/docs/api/index.html
- Чтобы использовать встроенные методы - нужно импортировать соответствующий класс указав полныйы путь пакета (кроме System) или весь пакет с *
```java
import java.util.ArrayList; // отдельный класс (удобнее для больших проектов)
import java.util.*;         // Пакет классов - может перекосить одноименные класы
```
- Нет никакой разницы в вышеописанных способах испорта для байт-кода и производительности. Оба способа дают одинаковый скомпилированный код.
- Импорты в Java — это только для компилятора, они не влияют на итоговый .class файл.
- ---
- В нашей версии Game_lite счетчик попаданий срабатывает даже если вводить одну и ту же координату
- 3 варианта решения проблемы:
  1) создание второго массива и если попал - этот удар вносить во второй массив, а затем сверяем с ним следующие попадания.
  2) Огранияиться оригинальным массивом, изменяя значения пораженных координат  на -1
  3) Создавать меньший массив из большего, оставляя только непораженные клетки или уменшьшать массив. 
- Третий вариант более удобный - особенно с представлением такого массива который будет уменшьшаться, если из него удалять элемент.
- Такая реализация возможно с помощью класса ArrayList из Java(API)


---
- В Java API классы сгруппированы в пакеты
- Нужно понимать в каких пакетах находится нужный класс
- ### Справочник пакетов из Java API

| Пакет | Назначение | Основные классы |
|-------|------------|-----------------|
| `java.lang` | **База языка** (доступен без импорта) | `String`, `Math`, `System`, `Integer`, `Double`, `Boolean`, `Object`, `Thread`, `Exception` |
| `java.util` | **Утилиты и коллекции** | `Scanner`, `ArrayList`, `HashMap`, `HashSet`, `LinkedList`, `Random`, `Date`, `Arrays`, `Collections` |
| `java.io` | **Ввод/вывод** (файлы, потоки) | `File`, `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`, `PrintWriter`, `InputStream`, `OutputStream` |
| `java.nio` | **Современный ввод/вывод** (NIO) | `Path`, `Files`, `Paths`, `ByteBuffer`, `Channel`, `Selector` |
| `java.net` | **Сетевое программирование** | `URL`, `Socket`, `ServerSocket`, `HttpURLConnection`, `InetAddress`, `URI` |
| `java.time` | **Дата и время** (Java 8+) | `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `Duration`, `Period`, `Instant` |
| `java.sql` | **Работа с базами данных** (JDBC) | `Connection`, `Statement`, `PreparedStatement`, `ResultSet`, `DriverManager`, `SQLException` |
| `java.awt` | **Графика** (старый GUI) | `Color`, `Font`, `Graphics`, `Image`, `Rectangle`, `Dimension` |
| `javax.swing` | **Графический интерфейс** (современный GUI) | `JFrame`, `JButton`, `JLabel`, `JTextField`, `JPanel`, `JTable`, `JTree`, `JMenu` |
| `java.applet` | **Апплеты** (устаревшее) | `Applet`, `AudioClip` |
| `java.beans` | **Компоненты** (JavaBeans) | `BeanInfo`, `PropertyChangeListener`, `PropertyDescriptor` |
| `java.math` | **Математика с большой точностью** | `BigInteger`, `BigDecimal`, `MathContext` |
| `java.text` | **Форматирование** (даты, чисел) | `SimpleDateFormat`, `NumberFormat`, `DecimalFormat`, `DateFormat`, `Collator` |
| `java.util.function` | **Функциональные интерфейсы** (лямбды) | `Function`, `Predicate`, `Consumer`, `Supplier`, `UnaryOperator`, `BinaryOperator` |
| `java.util.stream` | **Потоки данных** (Stream API) | `Stream`, `IntStream`, `LongStream`, `DoubleStream`, `Collectors` |
| `java.util.concurrent` | **Многопоточность** (продвинутая) | `Executor`, `ThreadPoolExecutor`, `ConcurrentHashMap`, `CountDownLatch`, `CyclicBarrier`, `Future` |
| `java.util.regex` | **Регулярные выражения** | `Pattern`, `Matcher`, `PatternSyntaxException` |
| `java.security` | **Безопасность и шифрование** | `MessageDigest`, `Signature`, `KeyPair`, `SecureRandom`, `Certificate` |
| `java.xml` | **Работа с XML** | `XMLParser`, `DocumentBuilder`, `SAXParser`, `XPath`, `Transformer` |
| `javax.xml.ws` | **Веб-сервисы** (SOAP) | `Service`, `Endpoint`, `WebService`, `WebMethod` |
| `javax.json` | **Работа с JSON** | `JsonObject`, `JsonArray`, `JsonReader`, `JsonWriter`, `JsonParser` |
| `java.management` | **Управление приложением** (JMX) | `MBeanServer`, `ObjectName`, `ManagementFactory` |
| `java.rmi` | **Удалённый вызов** (RMI) | `Remote`, `Naming`, `Registry`, `UnicastRemoteObject` |
| `java.sound` | **Звук и аудио** | `AudioInputStream`, `Clip`, `Mixer`, `SourceDataLine`, `AudioFormat` |
| `java.prefs` | **Настройки приложения** | `Preferences`, `AbstractPreferences` |
| `javax.script` | **Скриптовые языки** (вызов JS и др.) | `ScriptEngineManager`, `ScriptEngine`, `ScriptContext` |
| `javax.annotation` | **Аннотации** (стандартные) | `PostConstruct`, `PreDestroy`, `Resource`, `Generated` |
| `javax.transaction` | **Транзакции** | `TransactionManager`, `UserTransaction`, `TransactionSynchronizationRegistry` |
| `java.lang.annotation` | **Создание своих аннотаций** | `Annotation`, `Retention`, `Target`, `Inherited`, `Documented` |
| `java.lang.reflect` | **Рефлексия** (анализ классов) | `Class`, `Method`, `Field`, `Constructor`, `Proxy`, `Array` |

---
---
### ArrayList 
- `ArrayList` - класс из Java API в java.util.ArrayList;
- `ArrayList` - динамически изменяет размер массива до любого нужного размера (увеличивается и уменьшается)
```java
ArrayList<String> myList = new ArrayList <String> ();
// Добавить в массив add
myList add("BMW");
myList add("Mercedess-Benz");
```
- `<String>` - в таких чкобках указывается параметризированный тип (какие типы будут в ArrayList), в данном случае `String`
- [Работа с ArrayList](./ArrayListTestDrive.java) 








