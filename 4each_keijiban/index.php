<DOCTYPE html>
<html lang="ja">
	<head>
		 <meta charset="UTF-8">
		 <title>掲示板</title>
		 <link rel="stylesheet" type="text/css" href="style.css">
		 
	</head>
	<body>
     <?php
	 mb_internal_encoding("utf8");
	 $pdo=new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
	 $stmt = $pdo->query("select*from 4each_keijiban");
	 
	 ?>
	 
		 
		  <div class="pic">
		  <img src="4eachblog_logo.jpg">
		  </div>
		  <header>
			   <div class="logo"></div>
			   <ul>
			   <li>トップ</li>
			   <li>プロフィール</li>
			   <li>4eachについて</li>
			   <li>登録フォーム</li>
			   <li>お問い合わせ</li>
			   <li>その他</li>
			   </ul>
		  </header>
	
	 <main>
	     
		 <div class="left">
			  <h1>プログラミングに役立つ掲示板</h1>
			  
		 
	<div class="keiji">
		 
		 <div class="iri">入力フォーム</div>
		 
		 <form method="post" action="insert.php">
		 <div>
		    <label>ハンドルネーム</label>
			<br>
			<input type="text" class="text" size="35" name="handlename">
		 </div>
	     <div>
		<label>タイトル</label>
		<br>
		<input type="text" class="text" size="35" name="title">
	    </div>
	    <div>
		<label>コメント</label>
		<br>
		<textarea type="text" class="text" cols="90" rows="10" name="comments"></textarea>
	      <div>
		<input type="submit" class="submit" value="投稿する">
		  </div>
		</div>
		 </form>
	</div>

	
	
	<?php
	  while ($row = $stmt->fetch()){
	   echo"<div class='kiji'>";
	   echo"<h3>".$row['title']."</h3>";
	   echo"<div class='contents'>";
	   echo $row['comments'];
	   echo"<div class='handlename'>posted by".$row['handlename']."</div>";
	   echo"</div>";
	   echo"</div>";
	   }
	   ?>
		</div>		
		 <div class="right">
			   <h1>人気記事</h1>
				<p>PHPオススメ本</p>
				<p>PHP My Adminの使い方</p>
				<p>今人気のエディタ Top5</p>
				<p>HTMLの基礎</p>

			   <h1>オススメリンク</h1>
				<p>インターノウス株式会社</p>
				<p>XAMOOのダウンロード</p>
				<p>Eclipsenoダウンロード</p>
				<p>Bracketsのダウンロード</p>

			   <h1>カテゴリ</h1>
				<P>HTML</P>
				<p>PHP</p>
				<P>MySQL</P>
				<p>JavaScript</p>
				</div>
				
	 </main>
	<footer>
	<p>copyrght ⓒ internous|4each blog is the one which provides A to Z about prpgramming.</p>
	</footer>
	</body>
</html>
