# 로또 프로젝트 (luko7)

# 프로젝트 목표

목표 : 방문자 200명,이용 횟수 500 ( AWS를 이용한 https환경 구축 )

주제 : 일관된 번호로 로또 1회부터 현재까지 응모 했을 때 , 누적 당첨금액 확인 기능

측정방법 :  방문자/이용 횟수 별도 집계 

방문자 : 페이지 로딩될 때 +1 ( 쿠키를 이용한 24시간당 1회 증가)

이용 횟수 : 로또 로직 실행시 +1 

프로젝트 기간 : 2024/3/11 ~ 2024/4/11 (1달)

---


# 구성원
```swift
public Developer Luco() {
  public BackEnd HyungGeun;
  public BackEnd JongHo
  ...
}
```

---



  
  <div align="left">
<s>https://luco777.store</s>
</div>

---




# 기능

- [x] 로또 랜덤번호 추첨 기능
- [x] 원하는 번호 추첨 기능
- [x] 일관된 번호로 로또 1회부터 현재까지 응모 했을 때 , 누적 당첨금액 확인 기능
- [x] 이용자 중에 자신의 누적 당첨금액이 상위 몇%인지 측정하는 기능
- [x] 누적 당첨금액으로 가격이 정해진 물품을 얼마나 살 수 있는지 수량
- [x] 문의 및 건의사항 이메일 전송
- [x] 카카오톡 공유하기


---
# 웹 페이지    

<img width="400" alt="321467926-33356fa6-034b-4553-a3ab-95f5eb070b33" src="https://github.com/HyungGeun94/luko6/assets/152036928/7f0c4d40-479f-41fb-b9cd-17946269b3d3">
<img width="400" height="1000" src="https://github.com/user-attachments/assets/d5c49a71-9f8c-4ac9-9a7d-c05de0bbacdf" />
<img width="400" alt="300" src="https://github.com/HyungGeun94/luko6/assets/152036928/d5f91bf1-e24c-4306-9cb2-340987b7ceae">
<img width="400" height = "300" alt="스크린샷 2024-05-30 오전 10 22 35" src="https://github.com/HyungGeun94/Lotto/assets/152036928/d5080cd2-8488-4949-b11f-4c754c8e9bbc">
<img width="400" height = "300" alt="321467926-33356fa6-034b-4553-a3ab-95f5eb070b33" src="https://github.com/HyungGeun94/luko6/assets/152036928/eaf8b1f1-0edc-4d59-b809-e890e98a66ea">
<img width="400" height = "300" alt="321467926-33356fa6-034b-4553-a3ab-95f5eb070b33" src="https://github.com/HyungGeun94/luko6/assets/152036928/a6280715-daf2-41dd-8055-cd1d33c8e918">
<img width="400" height = "300" alt="스크린샷 2024-05-30 오전 10 23 36" src="https://github.com/HyungGeun94/Lotto/assets/152036928/6e8268b7-cfe2-483c-a6f5-cc99789fe0c7">







---

# 오류 해결 과정
* csrf 문제 : HTTPS를 사용하게 되면 CSRF 토큰이 없는 기능은 악의적인 접근으로 간주하여 막아주게 되는데

  CSRF 토큰을 발행해주지 않아서 이용자들이 사이트 사용 불가능함.

  로컬 환경 (근본적 해결 X, 디버깅할 때 사용) : CSRF 보호를 테스트 하는 동안 임시로 꺼두기


  서버 환경 (해결) : CSRF 토큰을 발행해주는 코드 추가해주기


* aws,ec2,RDS,DNS,도매인 구매(가비아),EIP(탄력적 아이피),https, SSL인증,포트 연결문제,ubuntu ec2 포트변경 등


   여러 문제들이 있었지만 공식 문서 및 오류 로그를 통한 서칭을 통해 원활하게 해결하였다


---



# 사용 도구

<img src="https://img.shields.io/badge/springboot 3.2.3 -6DB33F?style=for-the-badge&logo=springboot&logoColor=white">

<img src="https://img.shields.io/badge/java 17 -007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/mysql 8.0.28 -4479A1?style=for-the-badge&logo=mysql&logoColor=white">


<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">

<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  


 <img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> 

 <img src="https://img.shields.io/badge/amazonec2-232F3E?style=for-the-badge&logo=amazonec2&logoColor=white"> 

  <img src="https://img.shields.io/badge/amazonRDS-232F3E?style=for-the-badge&logo=amazonrds&logoColor=white"> 



 

  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">

  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">

  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">

  <img src="https://img.shields.io/badge/jquery 3.7.1 -0769AD?style=for-the-badge&logo=jquery&logoColor=white">

  

  ---


## 성과 지표

- 2024년 4월 11일 배포완료.
- 2024년 5월 30일 배포중단 (방문자: 148명, 이용 횟수: 494 ) 

  ---


  
# 문의 및 건의사항

1. 사이트 내 건의사항 및 문의사항 통해서 메일 보내기 
2. goorm94@naver.com
3. haberde97@gmail.com
---

                
