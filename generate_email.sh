#!/bin/bash

PROJECT_ID=$4

echo 'From: "Allure" <Allure_DBO4@uralsib.ru>' >> email.txt
echo 'From: "Allure" <Allure_DBO4@uralsib.ru>' >> email.txt
echo 'Subject: Allure Report tag:'$1' stand:'$2' browser:'$3 >> email.txt
echo 'MIME-Version: 1.0' >> email.txt
echo 'Content-Transfer-Encoding: 8bit' >> email.txt
echo 'Content-Type: multipart/mixed; boundary=MixedBoundary' >> email.txt
echo ' ' >> email.txt
echo '--MixedBoundary' >> email.txt
echo 'Content-Type: text/plain; charset="utf-8"' >> email.txt
echo ' ' >> email.txt
echo 'Коллеги, привет!' >> email.txt
echo 'Актуальный Allure Report' >> email.txt
echo "http://allure-dbo4:5050/allure-docker-service/latest-report?project_id=${PROJECT_ID,,}" >> email.txt
echo ' ' >> email.txt
echo '--MixedBoundary' >> email.txt
echo 'Content-Type: text/html; charset=utf-8' >> email.txt
echo 'Content-Transfer-Encoding: base64' >> email.txt
echo 'Content-Disposition: attachment; filename="AllureReport.html"' >> email.txt
curl http://MSK-GIT05-DBo4.fc.uralsibbank.ru:5050/allure-docker-service/emailable-report/export?project_id=${PROJECT_ID,,} > report.html
base64 report.html >> email.txt
echo '--MixedBoundary--' >> email.txt
curl smtp.nikoil.ru:25 --mail-from Allure_DBO4@uralsib.ru --mail-rcpt MakovejVS@uralsib.ru --mail-rcpt TimofeevAA@uralsib.ru --mail-rcpt AntropovEV@uralsib.ru --mail-rcpt SukhorukovVA@uralsib.ru --mail-rcpt ChizhikovaAV@uralsib.ru --mail-rcpt dkorepanov@lanit.ru --mail-rcpt narseeva@lanit.ru --mail-rcpt MikhajlinVV@ufa.uralsib.ru --mail-rcpt KashulinskAV@uralsib.ru --mail-rcpt PyshkinSS@uralsib.ru --mail-rcpt KrukovaMV@uralsibbank.ru --mail-rcpt PolyakovEV@uralsib.ru --mail-rcpt SergeenkoDV@uralsib.ru --mail-rcpt vol_aw@nikol.ru --upload-file email.txt