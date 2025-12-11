# 🚙 SQL 문제 --- CAR_RENTAL_COMPANY_CAR 테이블

## 📘 문제 설명

`CAR_RENTAL_COMPANY_CAR` 테이블은 자동차 대여 회사의 차량 정보를 담고
있으며 구성은 다음과 같습니다:

<table>
  <thead>
    <tr>
      <th>Column name</th>
      <th>Type</th>
      <th>Nullable</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>CAR_ID</td>
      <td>INTEGER</td>
      <td>FALSE</td>
    </tr>
    <tr>
      <td>CAR_TYPE</td>
      <td>VARCHAR(255)</td>
      <td>FALSE</td>
    </tr>
    <tr>
      <td>DAILY_FEE</td>
      <td>INTEGER</td>
      <td>FALSE</td>
    </tr>
    <tr>
      <td>OPTIONS</td>
      <td>VARCHAR(255)</td>
      <td>FALSE</td>
    </tr>
  </tbody>
</table>


-   **CAR_TYPE 종류:** 세단, SUV, 승합차, 트럭, 리무진\
-   **OPTIONS:** 콤마(`,`)로 구분된 옵션 리스트\
    (주차감지센서, 스마트키, 네비게이션, 통풍시트, 열선시트, 후방카메라,
    가죽시트)

## 🎯 요구사항

CAR_TYPE이 **'SUV'** 인 차량들의\
**일일 대여 요금(DAILY_FEE)의 평균을 계산하라.**

-   평균은 **소수 첫째 자리에서 반올림**
-   출력 컬럼명: **AVERAGE_FEE**

## 🧾 SQL 정답

``` sql
SELECT ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV';
```

## ✔ 출력 예시

  AVERAGE_FEE
  -------------
  18000
