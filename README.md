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
<p>Pour commencer à utiliser Java, il suffit d'installer le JDK (Java Development Kit) disponible à l'adresse suivante : <a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html" target="_blank">www.oracle.com/technetwork/java/javase/downloads</a></p>
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
<pre>Hello World !My name isCysboy</pre>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;System.out.print(&amp;#x22;Hello World ! \\n&amp;#x22;);\nSystem.out.println(&amp;#x22;My name is&amp;#x22;);\nSystem.out.println(&amp;#x22;\\nCysboy&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">print</span>(<span class="ace_string">"Hello World ! \n"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"My name is"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"\nCysboy"</span>);
</div></div></div></code></pre>
<p>Avec pour résultat :</p>
<pre>Hello World !
My name is<br/>
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

<p>Le type short(2 octets) contient les entiers compris entre -32768 et +32767.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;short vitesseMax;\nvitesseMax = 32000;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">short</span> <span class="ace_identifier">vitesseMax</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">vitesseMax</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">32000</span>;</div></div></div></code></pre>

<p>Le type int (4 octets) va de -2*10<sup>9</sup> à 2*10<sup>9</sup>.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int temperatureSoleil;\ntemperatureSoleil = 15600000; //La temp&amp;#xE9;rature est exprim&amp;#xE9;e en kelvins&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">temperatureSoleil</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">temperatureSoleil</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">15600000</span>; <span class="ace_comment">//La température est exprimée en kelvins</span>
</div></div></div></code></pre>

<p>Le type long (8 octets) peut aller de −9×10<sup>18</sup>  à 9×10<sup>18</sup>.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;long anneeLumiere;\nanneeLumiere = 9460700000000000L;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">long</span> <span class="ace_identifier">anneeLumiere</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">anneeLumiere</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">9460700000000000L</span>;</div></div></div></code></pre>

<p>Le type float (4 octets) est utilisé pour les nombres avec une virgule flottante.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;float pi;\npi = 3.141592653f;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">float</span> <span class="ace_identifier">pi</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">pi</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">3.141592653f</span>;</div></div></div></code></pre>

<p>Le type double (8 octets) est identique à float, si ce n'est qu'il contient plus de chiffres derrière la virgule.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;double division;\ndivision = 0.333333333333333333333333333333333333333333334d;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">double</span> <span class="ace_identifier">division</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">division</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">0.333333333333333333333333333333333333333333334d</span>;</div></div></div></code></pre>

<h3>Des variables stockant un caractère</h3>
<p>Le type « char » contient un caractère stocké entre apostrophes (« ' ' »), comme ceci :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;char caractere;\ncaractere = &amp;#x27;A&amp;#x27;;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">char</span> <span class="ace_identifier">caractere</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">caractere</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_string">'A'</span>;
</div></div></div></code></pre>

<h3>Des variables de type booléen</h3>
<p>Le type « boolean » ne peut contenir que deux valeurs : true (vrai) ou false (faux).</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;boolean question;\nquestion = true;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">boolean</span> <span class="ace_identifier">question</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">question</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_language ace_boolean">true</span>;</div></div></div></code></pre>

<h3>Le type String</h3>
<p>Le type « String » permet de gérer les chaînes de caractères, c'est-à-dire le stockage de texte. Il s'agit d'une variable d'un type plus complexe que l'on appelle <b>« objet »</b>.</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;//Premi&amp;#xE8;re m&amp;#xE9;thode de d&amp;#xE9;claration\nString phrase;\nphrase = &amp;#x22;Titi et Grosminet&amp;#x22;;\n\n//Deuxi&amp;#xE8;me m&amp;#xE9;thode de d&amp;#xE9;claration\nString str = new String();\nstr = &amp;#x22;Une autre cha&amp;#xEE;ne de caract&amp;#xE8;res&amp;#x22;;\n\n//Troisi&amp;#xE8;me m&amp;#xE9;thode de d&amp;#xE9;claration\nString string = &amp;#x22;Une autre cha&amp;#xEE;ne&amp;#x22;;\n\n//Quatri&amp;#xE8;me m&amp;#xE9;thode de d&amp;#xE9;claration\nString chaine = new String(&amp;#x22;Et une de plus !&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">//Première méthode de déclaration</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">String</span> <span class="ace_identifier">phrase</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">phrase</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_string">"Titi et Grosminet"</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">//Deuxième méthode de déclaration</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">String</span> <span class="ace_identifier">str</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_keyword">new</span> <span class="ace_support ace_function">String</span>();
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">str</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_string">"Une autre chaîne de caractères"</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">//Troisième méthode de déclaration</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">String</span> <span class="ace_identifier">string</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_string">"Une autre chaîne"</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_comment">//Quatrième méthode de déclaration</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">String</span> <span class="ace_identifier">chaine</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_keyword">new</span> <span class="ace_support ace_function">String</span>(<span class="ace_string">"Et une de plus !"</span>);</div></div></div></code></pre>

<h3>Conventions de nommage</h3>
<p>Tous vos noms de classes doivent commencer par une majuscule ;</p>
<p>Tous vos noms de variables doivent commencer par une minuscule ;</p>
<p>Si le nom d'une variable est composé de plusieurs mots, le premier commence par une minuscule, le ou les autres par une majuscule, et ce, sans séparation ;</p>
<p>Tout ceci sans accentuation !</p>
<p>On peut très bien compacter les phases de déclaration et d'initialisation en une seule phase ! Comme ceci :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int entier = 32;\nfloat pi = 3.1416f;\nchar carac = &amp;#x27;z&amp;#x27;;\nString mot = new String(&amp;#x22;Coucou&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">entier</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">32</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">float</span> <span class="ace_identifier">pi</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">3.1416f</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">char</span> <span class="ace_identifier">carac</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_string">'z'</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">String</span> <span class="ace_identifier">mot</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_keyword">new</span> <span class="ace_support ace_function">String</span>(<span class="ace_string">"Coucou"</span>);
</div></div></div></code></pre>

<p>Et lorsque nous avons plusieurs variables d'un même type, nous pouvons résumer tout ceci à une déclaration :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int nbre1 = 2, nbre2 = 3, nbre3 = 0;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">2</span>, <span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">3</span>, <span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">0</span>;</div></div></div></code></pre>

<h3>Les opérateurs arithmétiques :</h3>
<ul>
  <li>« + » : permet d'additionner deux variables numériques (mais aussi de concaténer des chaînes de caractères).</li>
  <li>« - » : permet de soustraire deux variables numériques.</li>
  <li>« * » : permet de multiplier deux variables numériques.</li>
  <li>« / » : permet de diviser deux variables.</li>
  <li>« % » : permet de renvoyer le reste de la division entière de deux variables de type numérique ; cet opérateur s'appelle le modulo.</li>
</ul>

<h3>Quelques exemples de calcul</h3>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int nbre1, nbre2, nbre3;  //D&amp;#xE9;claration des variables\n \nnbre1 = 1 + 3;            //nbre1 vaut 4\nnbre2 = 2 * 6;            //nbre2 vaut 12\nnbre3 = nbre2 / nbre1;    //nbre3 vaut 3\nnbre1 = 5 % 2;            //nbre1 vaut 1, car 5 = 2 * 2 + 1\nnbre2 = 99 % 8;           //nbre2 vaut 3, car 99 = 8 * 12 + 3\nnbre3 = 6 % 3;            //l&amp;#xE0;, nbre3 vaut 0, car il n&amp;#x27;y a pas de reste&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">nbre1</span>, <span class="ace_identifier">nbre2</span>, <span class="ace_identifier">nbre3</span>;  <span class="ace_comment">//Déclaration des variables</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span> 
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">1</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_constant ace_numeric">3</span>;            <span class="ace_comment">//nbre1 vaut 4</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">2</span> <span class="ace_keyword ace_operator">*</span> <span class="ace_constant ace_numeric">6</span>;            <span class="ace_comment">//nbre2 vaut 12</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre2</span> / <span class="ace_identifier">nbre1</span>;    <span class="ace_comment">//nbre3 vaut 3</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">5</span> <span class="ace_keyword ace_operator">%</span> <span class="ace_constant ace_numeric">2</span>;            <span class="ace_comment">//nbre1 vaut 1, car 5 = 2 * 2 + 1</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">99</span> <span class="ace_keyword ace_operator">%</span> <span class="ace_constant ace_numeric">8</span>;           <span class="ace_comment">//nbre2 vaut 3, car 99 = 8 * 12 + 3</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">6</span> <span class="ace_keyword ace_operator">%</span> <span class="ace_constant ace_numeric">3</span>;            <span class="ace_comment">//là, nbre3 vaut 0, car il n'y a pas de reste</span></div></div></div></code></pre>

<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int nbre1, nbre2, nbre3;    //D&amp;#xE9;claration des variables\nnbre1 = nbre2 = nbre3 = 0;  //Initialisation\n \nnbre1 = nbre1 + 1;     //nbre1 = lui-m&amp;#xEA;me, donc 0 + 1 =&amp;#x3E; nbre1 = 1\nnbre1 = nbre1 + 1;     //nbre1 = 1 (cf. ci-dessus), maintenant, nbre1 = 1 + 1 = 2\nnbre2 = nbre1;         //nbre2 = nbre1 = 2\nnbre2 = nbre2 * 2;     //nbre2 = 2 =&amp;#x3E; nbre2 = 2 * 2 = 4\nnbre3 = nbre2;         //nbre3 = nbre2 = 4\nnbre3 = nbre3 / nbre3; //nbre3 = 4 / 4 = 1\nnbre1 = nbre3;         //nbre1 = nbre3 = 1\nnbre1 = nbre1 - 1;     //nbre1 = 1 - 1 = 0&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">nbre1</span>, <span class="ace_identifier">nbre2</span>, <span class="ace_identifier">nbre3</span>;    <span class="ace_comment">//Déclaration des variables</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">0</span>;  <span class="ace_comment">//Initialisation</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span> 
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_constant ace_numeric">1</span>;     <span class="ace_comment">//nbre1 = lui-même, donc 0 + 1 =&gt; nbre1 = 1</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_constant ace_numeric">1</span>;     <span class="ace_comment">//nbre1 = 1 (cf. ci-dessus), maintenant, nbre1 = 1 + 1 = 2</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span>;         <span class="ace_comment">//nbre2 = nbre1 = 2</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">*</span> <span class="ace_constant ace_numeric">2</span>;     <span class="ace_comment">//nbre2 = 2 =&gt; nbre2 = 2 * 2 = 4</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre2</span>;         <span class="ace_comment">//nbre3 = nbre2 = 4</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre3</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre3</span> / <span class="ace_identifier">nbre3</span>; <span class="ace_comment">//nbre3 = 4 / 4 = 1</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre3</span>;         <span class="ace_comment">//nbre1 = nbre3 = 1</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">-</span> <span class="ace_constant ace_numeric">1</span>;     <span class="ace_comment">//nbre1 = 1 - 1 = 0</span></div></div></div></code></pre>

<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;nbre1 = nbre1 + 1;\nnbre1 += 1;\nnbre1++;\n++nbre1;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_constant ace_numeric">1</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">+=</span> <span class="ace_constant ace_numeric">1</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span><span class="ace_keyword ace_operator">++</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword ace_operator">++</span><span class="ace_identifier">nbre1</span>;</div></div></div></code></pre>

<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;nbre1 = nbre1 - 1;\nnbre1 -= 1;\nnbre1--;\n--nbre1;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">-</span> <span class="ace_constant ace_numeric">1</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">-=</span> <span class="ace_constant ace_numeric">1</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span><span class="ace_keyword ace_operator">--</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword ace_operator">--</span><span class="ace_identifier">nbre1</span>;</div></div></div></code></pre>

<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;nbre1 = nbre1 * 2;\nnbre1 *= 2;\nnbre1 = nbre1 / 2;\nnbre1 /= 2;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">*</span> <span class="ace_constant ace_numeric">2</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">*=</span> <span class="ace_constant ace_numeric">2</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">nbre1</span> / <span class="ace_constant ace_numeric">2</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">nbre1</span> /<span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">2</span>;</div></div></div></code></pre>

<p>L'opérateur « + » sert aussi d'opérateur de concaténation, c'est-à-dire qu'il permet de mélanger du texte brut et des variables. Voici un exemple d'affichage avec une perte de précision :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;double nbre1 = 10, nbre2 = 3;\nint resultat = (int)(nbre1 / nbre2);\nSystem.out.println(&amp;#x22;Le r&amp;#xE9;sultat est = &amp;#x22; + resultat);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">double</span> <span class="ace_identifier">nbre1</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">10</span>, <span class="ace_identifier">nbre2</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">3</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">resultat</span> <span class="ace_keyword ace_operator">=</span> (<span class="ace_keyword">int</span>)(<span class="ace_identifier">nbre1</span> / <span class="ace_identifier">nbre2</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Le résultat est = "</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_identifier">resultat</span>);</div></div></div></code></pre>

<h3>Les conversions, ou « cast »</h3>
<p>D'un type « int » en type « float ».</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int i = 123;\nfloat j = (float)i;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">123</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">float</span> <span class="ace_identifier">j</span> <span class="ace_keyword ace_operator">=</span> (<span class="ace_keyword">float</span>)<span class="ace_identifier">i</span>;</div></div></div></code></pre>

<p>D'un type « int » en « double ».</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int i = 123;\ndouble j = (double)i;&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">123</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">double</span> <span class="ace_identifier">j</span> <span class="ace_keyword ace_operator">=</span> (<span class="ace_keyword">double</span>)<span class="ace_identifier">i</span>;</div></div></div></code></pre>

<p>Et inversement :</p>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;double i = 1.23;\ndouble j = 2.9999999;\nint k = (int)i;        //k vaut 1\nk = (int)j;            //k vaut 2&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">double</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">1.23</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">double</span> <span class="ace_identifier">j</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">2.9999999</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">k</span> <span class="ace_keyword ace_operator">=</span> (<span class="ace_keyword">int</span>)<span class="ace_identifier">i</span>;        <span class="ace_comment">//k vaut 1</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_identifier">k</span> <span class="ace_keyword ace_operator">=</span> (<span class="ace_keyword">int</span>)<span class="ace_identifier">j</span>;            <span class="ace_comment">//k vaut 2</span></div></div></div></code></pre>

<h3>Récupérer ce que vous tapez</h3>
<img src="https://github.com/dhambrimourad/java1/blob/master/Images/scanner.png" />

<h3>La structure If… else…</h3>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int i = 0;\nif (i &amp;#x3C; 0)\n  System.out.println(&amp;#x22;Ce nombre est n&amp;#xE9;gatif !&amp;#x22;);      \n  \nelse if(i &amp;#x3E; 0)\n  System.out.println(&amp;#x22;Ce nombre est positif !&amp;#x22;);           \n \nelse  \n  System.out.println(&amp;#x22;Ce nombre est nul !&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">0</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">if</span> (<span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">&lt;</span> <span class="ace_constant ace_numeric">0</span>)
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Ce nombre est négatif !"</span>);      
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">else</span> <span class="ace_keyword">if</span>(<span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">&gt;</span> <span class="ace_constant ace_numeric">0</span>)
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Ce nombre est positif !"</span>);           
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span> 
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">else</span>  
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Ce nombre est nul !"</span>);</div></div></div></code></pre>

<h3>Les conditions multiples</h3>
<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int i = 58;\nif(i &amp;#x3C; 100 &amp;#x26;&amp;#x26; i &amp;#x3E; 50) \n  System.out.println(&amp;#x22;Le nombre est bien dans l&amp;#x27;intervalle.&amp;#x22;);\nelse\n  System.out.println(&amp;#x22;Le nombre n&amp;#x27;est pas dans l&amp;#x27;intervalle.&amp;#x22;);&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">58</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">if</span>(<span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">&lt;</span> <span class="ace_constant ace_numeric">100</span> <span class="ace_keyword ace_operator">&amp;&amp;</span> <span class="ace_identifier">i</span> <span class="ace_keyword ace_operator">&gt;</span> <span class="ace_constant ace_numeric">50</span>) 
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Le nombre est bien dans l'intervalle."</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">else</span>
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"Le nombre n'est pas dans l'intervalle."</span>);</div></div></div></code></pre>






<pre class="code-block"><code data-claire-semantic="java" data-code="{&quot;language&quot;:&quot;java&quot;,&quot;source&quot;:&quot;int a = 1, b = 15;\nwhile (a &amp;#x3C; b)\n{\n  System.out.println(&amp;#x22;coucou &amp;#x22; +a+ &amp;#x22; fois !!&amp;#x22;);\n}&quot;}" class="ace" data-widget="codeBlock"><div class="ace-openclassrooms"><div class="ace_static_highlight ace_show_gutter" style="counter-reset:ace_line 0"><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">int</span> <span class="ace_identifier">a</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">1</span>, <span class="ace_identifier">b</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">15</span>;
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span><span class="ace_keyword">while</span> (<span class="ace_identifier">a</span> <span class="ace_keyword ace_operator">&lt;</span> <span class="ace_identifier">b</span>)
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>{
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>  <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"coucou "</span> <span class="ace_keyword ace_operator">+</span><span class="ace_identifier">a</span><span class="ace_keyword ace_operator">+</span> <span class="ace_string">" fois !!"</span>);
</div><div class="ace_line"><span class="ace_gutter ace_gutter-cell" unselectable="on"></span>}
</div></div></div></code></pre>
