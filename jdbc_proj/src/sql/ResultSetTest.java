package sql;

/* select sql .
    ㄴ 데이터를 조회. 테이블의 행 집합을 결과로 얻습니다.
    ㄴ 'ResultSet' 타입 객체는 행 집합을 저장합니다. select 쿼리에서 사용되는 리턴 타입.
      - ResultSet 객체는 현재 데이터 행을 가리키는 커서를 유지합니다.
      - 처음에는 커서가 첫 번째 행 앞에 배치됩니다. (첫번째 행이 0이라면 -1 에 위치)
      - next() 메서드는 커서를 다음 행으로 이동시키며, ResultSet 객체에 더 이상 행이 없을 때  false를 반환
      - next() 메서드 결과 집합을 반복하는 데 사용할 수 있습니다.
           ㄴ select 결과로 얻어지는 행의 갯수는 알 수 없습니다. 반복문 while 사용
            단, PK 컬럼 조건식은 행이 0 또는 1개 조회됩니다.

*/

public class ResultSetTest {

}
