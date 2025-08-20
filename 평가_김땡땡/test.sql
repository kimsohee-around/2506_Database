
-- ※ 다음과 같이 지정된 테이블에서 조회하는 SQL 명령을 작성하세요.
-- 3. TBL_BUY 테이블에서 2025년의 구매 내역 모든 컬럼 조회하기

-- 4. TBL_PRODUCT 테이블에서 category 가 ‘B1’ 인 상품명과 가격 조회

-- 5. TBL_CUSTOMER 테이블에서 email 을  'gmail'  사용하는 고객 이름, 이메일 조회

-- ※ 다음과 같이 테이블 JOIN을 사용하는 SQL 명령을 작성하세요.
-- 6. category ‘B1’ 상품을 구매한 고객ID, 이름, 구매날짜를 조회
-- 7. CUSTOM_ID  'twice' 의 구매 내역을 상품명,가격, 구매금액, 구매날짜 조회

-- ※ 그룹화 함수를 사용하여 SQL 명령을 작성하세요.
-- 8. 상품별 구매 건수를  상품코드, 구매건수 출력하여 조회하세요.
-- 9. 카테고리별 상품의 평균 가격을 카테고리, 평균가격 출력하여 조회하세요.

-- ※ 다음과 같이 JOIN과 그룹화 함수를 이용한 SQL 명령을 작성하세요.
-- 10. 년도별 구매 금액 합계를  년도, 구매금액 출력하여 조회하세요.







-- 문제 1. 
-- 고객 테이블
CREATE TABLE tbl_customer# (
	customer_id varchar2(20) PRIMARY KEY ,    
	name varchar2(20) NOT NULL,		   
	email varchar2(30),
	age number(3) default 0 ,		
	reg_date date 
);

-- 상품 테이블 
CREATE TABLE tbl_product(
	pcode varchar2(20) PRIMARY KEY ,
	category char(2) ,
	pname varchar2(50) NOT NULL,
	price number NOT NULL 
);

-- 구매테이블
CREATE TABLE tbl_buy(
	buy_seq number PRIMARY KEY ,		
	customer_id varchar2(20) NOT NULL ,			
	pcode varchar2(20) NOT NULL ,
	quantity number NOT NULL ,		
	buy_date timestamp
);


-- 외래키 추가
ALTER TABLE tbl_buy ADD 
CONSTRAINT fk_buy_customer
FOREIGN KEY (customer_id)				
			REFERENCES tbl_customer#(customer_id);	
		
ALTER TABLE tbl_buy ADD 	
CONSTRAINT fk_buy_pcode
	FOREIGN KEY (pcode)
			REFERENCES tbl_product(pcode);

-- 문제 2. 
-- 시퀀스 생성
CREATE SEQUENCE seq_tblbuy
START WITH 2001;

