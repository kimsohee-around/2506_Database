## JDBC(Java Database Connectivity)
자바에서 데이터베이스와 연결하고 데이터를 주고받을 수 있도록 해주는 자바 API

* 자바에서 SQL 문을 실행하고 결과를 처리할 수 있도록 해주는 표준 인터페이스
* 다양한 DBMS(예: MySQL, Oracle 등)와 상관없이'일관된 방식'으로 데이터베이스에 접근 가능
     ㄴ DBMS 에 상관없이 동일한 인터페이스와 구현 메소드 사용함.
     ㄴ ✔ 실제 구현 클래스는 드라이버 (라이브러리) 에 포함되어 있음.
     오라클 드라이버 라이브러리 경로 : C:\app\Class01\product\18.0.0\dbhomeXE\jdbc\lib
            드라이버 파일명 : ojdbc8.jar 
* 자바의 java.sql 패키지에 포함되어 있음
  * ㄴ java.sql 패키지의 인터페이스들을 구현한 클래스 로드가 필요합니다.
  * ㄴ oracle.jdbc.driver.OracleDirver 클래스는 자동 로딩.
  * 참고 : mysql 의 드라이버 클래스는 com.mysql.jdbc.Driver 입니다.