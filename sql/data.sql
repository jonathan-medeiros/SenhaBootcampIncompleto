/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Renan Miguel
 * Created: 30/08/2022
 */

create database senha;

use database senha;

create table atendimento(
id integer primary key auto_increment,
nome varchar(200) not null,
data datetime not null,
atendimento datetime null,
status integer not null
);
