![alt text](https://github.com/VlahovskiAndrej/DIANS/blob/main/Domasna3,4/CultureCanvasMK/src/main/resources/static/images/cc.webp?raw=true&&size=100x100) 
# Дизајн и архитектура на софтвер

**Линк до апликацијата:**<br  />
-  https://culturecanvas-abbbfc3fc458.herokuapp.com/

**Линк кон видео за функционалности на апликацијата:** <br  />
-  https://www.youtube.com/watch?v=rhmVZQelGs4

**Автори:**<br />
- Андреј Влаховски (211136)<br /> 
- Самоил Јаќимовски (211036)<br />
- Филип Аврамоски (211063)<br />
- Ангела Кранго (213008)<br />
- Филип Трајаноски (213010)

**Ментори:**<br />
- проф. д-р Љупчо Антовски<br />
- проф. д-р Петре Ламески<br />

**Архитектура на проектот:**<br />
- Апликацијата ја користи Spring рамката за backend развој и следи принципите на Spring и SOLID
за развој на квалитетен код, a за frontend развој се користи Thymeleaf како template engine.<br />

* Нашата апликација користи MVC (Model-View-Controller) архитектурен модел со помош на Spring Boot.
MVC е дизајн патерн што го раздвојува кодот во три основни делови: Model (Модел), View (Поглед) и Controller (Контролер).<br />

* Покрај користење на MVC design pattern за целата апликација, се користи и 
Factory design pattern во делот за креирање/додавање на нови дестинации.
Исто така се користи и Singleton како design pattern. Класите кои се анотирани со @Component, @Service, @Controller, @Repository,
и слични, се посматраат како Spring Bean-ови. При секое инстанцирање на конкретен Bean,
Spring Inversion Of Control (IoC) контејнерот креира единствена инстанца и ја интегрира
таа инстанца во контекстот на апликацијата. Ова означува дека секој Singleton Bean постои
само во една инстанца во рамките на целата апликација.<br />

* Оваа практика обезбедува централизирана управување на инстанците на класите,
што допринаси кон подобра управливост и ефикасност во управувањето на ресурсите во апликацијата.
Според принципите на Spring, овие Singleton Bean-ови се автоматски инжектирани во потребните компоненти,
овозможувајќи лесна интеграција и соработка меѓу различните делови на кодот.<br />

**Опис на апликацијата:**<br />
- Нашата цел за оваа апликација е да го претставиме богатото минато на Македонија.
Ке искористиме веб базирана платформа и апликацијата ке биде брза и “user-friendly”,
односно лесна за користење на корисниците. За ова се да претставиме ке ги
користиме јавно достапните податоци на OpenStreetMap. При отварање на оваа
апликација ке се добие листа од најблиските места до моменталната локација на
корисникот, како и рута по која најбрзо и најефикасно може да се дојде до нив. Ке има
опција каде што за секој град ке се покажува како е најдобро да се прошетаат и видат
сите објекти. Ке има мапа од Македонија каде што ке бидат прикажани сите места,
како и мапи за секој поголем град соодветно. Корисниците ќе имаат можност за секое
селектирано историско наследство да го видат неговото име, локација, работни
часови, веб страна(доколку ја има), каков тип на објект е и телефонски број за
контакт(доколку има).
