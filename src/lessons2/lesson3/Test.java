package lessons2.lesson3;
// public, private, default(всё что default доступно в пределах этого пакета), protected - (доступно в пределах
// одного пакетаб доступны всем подклассам, даже если эти подклассы вне пакета) Модификаторы доступа в java.
import lessons2.lesson3.packet1.Person;

public class Test extends Person {

        public Test(){
            name = "Tom";

        }

    }

