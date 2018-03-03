# Programmation JAVA

<a href="#hello">Hello World</a>

<h3>Présentation</h3>

<p>Développé par Sun Microsystems, présenté officiellement le 23 mai 1995.</p>
<p>La société Sun a été ensuite rachetée en 2009 par la société Oracle qui détient et maintient désormais Java.</p>
<p>Une de ses plus grandes forces est son excellente portabilité : une fois votre programme créé, il fonctionnera automatiquement sous Windows, Mac, Linux, etc.</p>

<p>Il permet de développer :</p>
<ul>
  <li>des applications, sous forme de fenêtre ou de console.</li>
  <li>des applets, qui sont des programmes Java incorporés à des pages web.</li>
  <li>des applications pour appareils mobiles.</li>
  <li>et bien d'autres ! J2EE pour les applications d'entreprise, JMF pour le traitement vidéo, J3D pour la 3D...</li>
</ul>

<h3>Les certifications Java</h3>
<p>Pour être certifié Java SE 7, vous devez passer ces 2 examens :</p>
<ul>
  <li>1Z0-803 Oracle Certified Associate, Java SE 7 Programmer I.</li>
  <li>1Z0-804 Oracle Certified Professional , Java SE 7 Programmer II.</li>
</ul>

<h3>Les certifications J2ee</h3>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/certification.png" />

<h3>Les outils de développement</h3>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/jdk.png" />
<p>Cochez la case : « Accept License Agreement » puis cliquez sur le lien correspondant à votre système d'exploitation (x86 pour un système 32 bits et x64 pour un système 64 bits).</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/jdk1.png" />

<h3>Compilation en ligne de commande</h3>
<ul>
  <li>Mettre à jour la variable d’environnement « PATH ». C'est grâce à elle que Windows trouve des exécutables sans  qu'il soit nécessaire de lui spécifier le chemin d'accès complet.</li>
  <li>Allez dans le répertoire de votre premier programme et effacez le « .class ». Ensuite, faites « Démarrer > Exécuter » (ou encore touche « Windows + R » et tapez « cmd ».</li>
  <li>Maintenant, vous pouvez créer votre fichier « .class » en exécutant la commande suivante :</li>
  <br/><pre><code>javac &lt;nomDeFichier.java&gt;</code></pre>
  <li>Vous pouvez lancer votre programme Java en faisant ce qui suit :</li>
  <br/><pre><code>java &lt;nomFichierClassSansExtension&gt;</code></pre>
</ul>

<h3>Eclipse IDE</h3>
<p>Eclipse IDE est un environnement de développement libre permettant de créer des programmes dans de nombreux langages de programmation (Java, C++, PHP…). C'est l'outil que nous allons utiliser pour programmer.</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse.png" />

<h3>Créer un nouveau projet Java.</h3>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse1.png" />
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse2.png" />
<p>Vous devriez avoir un nouveau projet dans la fenêtre de gauche, comme à la figure suivante.</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse3.png" />
<p>Ajoutons une nouvelle classe dans ce projet.</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse4.png" />
<p>Cochez la case : «public static void main(String[] args)».</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse5.png" />

<h3>Votre premier programme</h3>
<p>Tous les programmes Java sont composés d'au moins une classe. Elle doit contenir une méthode appelée « main »: ce sera le point de démarrage de notre programme.</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse6.png" />

<h3>Les commentaires</h3>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;public static void main(String[] args){\n  //Un commentaire\n  //Un autre\n  //Encore un autre\n\n  /*\n  Un commentaire\n  Un autre\n  Encore un autre\n  */\n\nCeci n&amp;#x27;est pas un commentaire !\n}&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">public</span> <span class="ace_keyword">static</span> <span class="ace_keyword">void</span> <span class="ace_identifier">main</span>(<span class="ace_support ace_function">String</span>[] <span class="ace_identifier">args</span>){
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_comment">//Un commentaire</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_comment">//Un autre</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_comment">//Encore un autre</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_comment">/*</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">  Un commentaire</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">  Un autre</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">  Encore un autre</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">  */</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">Ceci</span> <span class="ace_identifier">n</span>'<span class="ace_identifier">est</span> <span class="ace_identifier">pas</span> <span class="ace_identifier">un</span> <span class="ace_identifier">commentaire</span> <span class="ace_keyword ace_operator">!</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>}
</div></div></div></code></pre>

<h3><a name=hello>Hello World</a></h3>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;public static void main(String[] args){\n  System.out.print(&amp;#x22;Hello World !&amp;#x22;);\n}&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">public</span> <span class="ace_keyword">static</span> <span class="ace_keyword">void</span> <span class="ace_identifier">main</span>(<span class="ace_support ace_function">String</span>[] <span class="ace_identifier">args</span>){
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"Hello World !"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>}
</div></div></div></code></pre>

<p>Une fois que vous avez saisi cette ligne de code dans votre méthode main, il vous faut lancer le programme.</p>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse7.png" /><br/>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/eclipse8.png" /><br/>
<p>Prenons le code suivant :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;System.out.print(&amp;#x22;Hello World !&amp;#x22;);\nSystem.out.print(&amp;#x22;My name is&amp;#x22;);\nSystem.out.print(&amp;#x22;Cysboy&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"Hello World !"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"My name is"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"Cysboy"</span>);
</div></div></div></code></pre>
<p>Résultat:</p>
<pre>« Hello World !My name isCysboy ».</pre>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;System.out.print(&amp;#x22;Hello World ! \\n&amp;#x22;);\nSystem.out.println(&amp;#x22;My name is&amp;#x22;);\nSystem.out.println(&amp;#x22;\\nCysboy&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"Hello World ! \n"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"My name is"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"\nCysboy"</span>);
</div></div></div></code></pre>
<p>Avec pour résultat :</p>
<pre>Hello World !
My name is
 
Cysboy</pre>

<h3>Les variables et les opérateurs</h3>
<p>En Java, nous avons deux types de variables :</p>
<ul>
  <li>des variables de type simple ou « primitif » ;</li>
  <li>des variables de type complexe ou des « objets ».</li>
</ul>
<h3>Les variables de type numérique</h3>
<p>Le type byte (1 octet) peut contenir les entiers entre -128 et +127.</p>

<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;byte temperature;\ntemperature = 64;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">byte</span> <span class="ace_identifier">temperature</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">temperature</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">64</span>;</div></div></div></code></pre>








<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int a = 1, b = 15;\nwhile (a &amp;#x3C; b)\n{\n  System.out.println(&amp;#x22;coucou &amp;#x22; +a+ &amp;#x22; fois !!&amp;#x22;);\n}&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">a</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">1</span>, <span class="ace_identifier">b</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">15</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">while</span> (<span class="ace_identifier">a</span> <span class="ace_keyword ace_operator">&lt;</span> <span class="ace_identifier">b</span>)
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>{
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"coucou "</span> <span class="ace_keyword ace_operator">+</span><span class="ace_identifier">a</span><span class="ace_keyword ace_operator">+</span> <span class="ace_string">" fois !!"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>}
</div></div></div></code></pre>
