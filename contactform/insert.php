<?php
mb_internal_encoding("UTF8");
$pdo=new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");

$pdo->exec("insert into contatform(name,mail,age,comments)values
('".$_POST['name']."','".$_POST['mail']."','".$_POST['age']."','".$_POST['comments']."');");
?>

<DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
 <title>お問い合わせファームを作る</title>
 <link rel="stylesheet" type="text/css" href="style2.css">
</head>

<body>
 <h1>お問い合わせファーム</h1>
 　<div class="confirm">
    <p>お問い合わせ有難うございました。<br>３営業日以内に担当者より連絡差し上げます。
	</p>
	
  
  </div>
</body>
</html>