-- 그룹화 연습을 위해 tbl_car_co2 에 행 데이터 변경(최종 31개)  👇 아래 쪽에 있음.












-- ✅ 복습 : 그룹화 연습을 위해 tbl_car_co2 에 행 데이터 변경(최종 31개)  
CREATE SEQUENCE seq_carco2
START WITH 10001;
-- 시퀀스 다음 값 가져오기 : seq_carco2.nextval
-- 테이블의 기존 데이터 삭제하기 
TRUNCATE TABLE tbl_car_co2;
-- 데이터 모두 insert
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Toyota', 'Aygo', 1000, 790, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mitsubishi', 'Space Star', 1200, 1160, 95);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Skoda', 'Citigo', 1000, 929, 95);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mini', 'Cooper', 1500, 1140, 105);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'VW', 'Up!', 1000, 929, 105);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Skoda', 'Fabia', 1400, 1109, 90);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mercedes', 'A-Class', 1500, 1365, 92);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Ford', 'Fiesta', 1500, 1112, 98);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Audi', 'A1', 1600, 1150, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Hyundai', 'I20', 1100, 980, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Suzuki', 'Swift', 1300, 990, 101);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Ford', 'Fiesta', 1000, 1112, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Honda', 'Civic', 1600, 1252, 94);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Hundai', 'I30', 1600, 1326, 97);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Opel', 'Astra', 1600, 1330, 97);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Skoda', 'Rapid', 1600, 1119, 104);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Ford', 'Focus', 2000, 1328, 105);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Ford', 'Mondeo', 1600, 1584, 94);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Opel', 'Insignia', 2000, 1428, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mercedes', 'C-Class', 2100, 1365, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Skoda', 'Octavia', 1600, 1415, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Volvo', 'S60', 2000, 1415, 99);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mercedes', 'CLA', 1500, 1465, 102);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Audi', 'A4', 2000, 1490, 104);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Audi', 'A6', 2000, 1725, 114);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Volvo', 'V70', 1600, 1523, 101);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Mercedes', 'E-Class', 2100, 1605, 115);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Volvo', 'XC70', 2000, 1746, 100);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Ford', 'B-Max', 1600, 1235, 104);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
 VALUES (seq_carco2.nextval,'Opel', 'Zafira', 1600, 1405, 109);
INSERT INTO TBL_CAR_CO2(IDX,CAR,MODEL,VOLUME,WEIGHT,CO2) 
VALUES (seq_carco2.nextval, 'Mercedes', 'SLK', 2500, 1395, 120);
