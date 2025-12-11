🚗 CAR_RENTAL_COMPANY_CAR 테이블 문제 설명 (HTML 테이블 포함)

다음은 어느 자동차 대여 회사에서 대여중인 자동차들의 정보를 담은 CAR_RENTAL_COMPANY_CAR 테이블입니다.
CAR_RENTAL_COMPANY_CAR 테이블은 아래와 같은 구조로 되어있으며, CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS 는 각각 자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트를 나타냅니다.
📌 테이블 구조 (HTML)
<table> <thead> <tr> <th>Column name</th> <th>Type</th> <th>Nullable</th> </tr> </thead> <tbody> <tr> <td>CAR_ID</td> <td>INTEGER</td> <td>FALSE</td> </tr> <tr> <td>CAR_TYPE</td> <td>VARCHAR(255)</td> <td>FALSE</td> </tr> <tr> <td>DAILY_FEE</td> <td>INTEGER</td> <td>FALSE</td> </tr> <tr> <td>OPTIONS</td> <td>VARCHAR(255)</td> <td>FALSE</td> </tr> </tbody> </table>

자동차 종류는 '세단', 'SUV', '승합차', '트럭', '리무진' 이 있습니다.
자동차 옵션 리스트는 콤마(',')로 구분된 키워드 리스트(예: '열선시트', '스마트키', '주차감지센서')로 되어있으며,
키워드 종류는 '주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트' 가 있습니다.

📘 문제

CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요.
이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.
📋 예시 (HTML)

예를 들어 CAR_RENTAL_COMPANY_CAR 테이블이 다음과 같다면:

<table> <thead> <tr> <th>CAR_ID</th> <th>CAR_TYPE</th> <th>DAILY_FEE</th> <th>OPTIONS</th> </tr> </thead> <tbody> <tr> <td>1</td> <td>세단</td> <td>16000</td> <td>가죽시트,열선시트,후방카메라</td> </tr> <tr> <td>2</td> <td>SUV</td> <td>14000</td> <td>스마트키,네비게이션,열선시트</td> </tr> <tr> <td>3</td> <td>SUV</td> <td>22000</td> <td>주차감지센서,후방카메라,가죽시트</td> </tr> </tbody> </table>

‘SUV’ 에 해당하는 자동차들의 평균 일일 대여 요금은 18,000원이므로, 다음과 같은 결과가 나와야 합니다.
AVERAGE_FEE
18000
