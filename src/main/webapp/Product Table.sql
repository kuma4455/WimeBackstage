DROP DATABASE IF EXISTS wime;
CREATE DATABASE wime CHARACTER SET utf8 COLLATE utf8_general_ci; 
USE wime;

/*產品Product Table*/ 
DROP TABLE IF EXISTS Product;
CREATE TABLE Product
(
 PD_Number        INT(3) NOT NULL,              /*產品數量*/        
 PD_Name          VARCHAR(30) NOT NULL,		    /*產品名稱*/
 PD_ID            INT AUTO_INCREMENT NOT NULL , /* PK FK 產品料號*/
 PD_Stock         INT(5) NOT NULL,		  	   /*庫存數量*/
 PD_Desc          VARCHAR(30) NOT NULL,		   /*產品料號*/
 PD_Price         DECIMAL(8,2) NOT NULL ,	   /*FK產品價格*/
 PD_Pic           VARCHAR(50) NOT NULL,   	   /*產品圖片*/
 PD_Software      VARCHAR(50),   	           /*QRcode軟體下載*/
 PD_SoftDesc      TEXT,		   	   	   		   /*軟體說明*/
 PD_Image 		  BLOB,
 PRIMARY KEY(PD_ID)
)ENGINE = INNODB CHARACTER SET UTF8 COLLATE utf8_general_ci;