🚙 SQL 문제 — CAR_RENTAL_COMPANY_CAR 테이블
📘 문제 설명

CAR_RENTAL_COMPANY_CAR 테이블은 자동차 대여 회사의 차량 정보를 담고 있으며 구성은 다음과 같습니다:

Column name	Type	Nullable
CAR_ID	INTEGER	FALSE
CAR_TYPE	VARCHAR(255)	FALSE
DAILY_FEE	INTEGER	FALSE
OPTIONS	VARCHAR(255)	FALSE

CAR_TYPE 종류: 세단, SUV, 승합차, 트럭, 리무진

OPTIONS: 콤마(,)로 구분된 옵션 리스트
(주차감지센서, 스마트키, 네비게이션, 통풍시트, 열선시트, 후방카메라, 가죽시트)

🎯 요구사항

CAR_TYPE이 'SUV' 인 차량들의
일일 대여 요금(DAILY_FEE)의 평균을 계산하라.

평균은 소수 첫째 자리에서 반올림

출력 컬럼명: AVERAGE_FEE

🧾 SQL 정답
SELECT ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV';

✔ 출력 예시
AVERAGE_FEE
18000
