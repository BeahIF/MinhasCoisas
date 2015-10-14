package atividade;

public class Main {

	public static void main(String[] args) {
	/*	THE LAST ONE: everything together now
		=====================================
		["Agora parece um pedido seu ...""](http://youtu.be/YdVQzJKx1F4)

		* * *

		## Implementar um BLOG

		Nesta atividade se est� adotando pontua��o progressiva, preste bastante aten��o.

		### Implementar um conversor de Markdown para HTML 1.0

		Markdown � uma formata��o usada para especificar elementos de um documento como t�tulos,
		par�grafos, listas, etc. A especifica��o do formato pode ser vista neste endere�o 
		<https://daringfireball.net/projects/markdown/>.

		O objetivo � implementar uma parte que est� a seguir:

	- Texto iniciado com `# texto` tornar-se um `<h1>texto</h1>`; ok
	- Texto iniciado com `## texto` tornar-se um `<h2>texto</h2>`; ok
	- Texto iniciado com `### texto` tornar-se um `<h3>texto</h3>`; ok
	-> Qualquer texto � transformado em par�grafo, por exemplo, o texto `Um texto de teste...`
	 	torna-se `<p>Um texto de teste...</p>`
	-> Texto abra�ado com `<` e `>`, por exemplo `<google.com>` torna-se uma �ncora, 
		por exemplo `<a href="google.com">google.com</a>`;
	- Texto abra�ado com `*` fica it�lico, por exemplo `*um texto*` torna-se `<em>um texto</em>`.
	- Texto abra�ado com `**` fica negrito, por exemplo `**um texto**` torna-se `<strong>um texto</strong>`


		Para fazer essa convers�o ser� criada uma classe `Markdown` com o m�todo est�tico `toHTML(String):String`.
		Os Casos de teste est�o a seguir:

		Casos de teste:*/
		// texto plano � um par�grafo por padr�o
		System.out.println(Markdown.toHTML("texto").equals("<p>texto</p>"));
		// espa�os antes e depois da string devem ser ignorados
		System.out.println(Markdown.toHTML("  texto e teste  ").equals("<p>texto e teste</p>"));
		// t�tulos
		System.out.println(Markdown.toHTML("# T�TULO PRINCIPAL").equals("<h1>T�TULO PRINCIPAL</h1>"));
		// lembrando, espa�os antes e depois s�o ignorados
		System.out.println(Markdown.toHTML("#     T�TULO PRINCIPAL    ").equals("<h1>T�TULO PRINCIPAL</h1>"));
		System.out.println(Markdown.toHTML("## T�tulos de segundo n�vel").equals("<h2>T�tulos de segundo n�vel</h2>"));
		System.out.println(Markdown.toHTML("### T�tulos de terceiro n�vel").equals("<h3>T�tulos de terceiro n�vel</h3>"));
		// quando fica junto � ignorado
		System.out.println(Markdown.toHTML("#N�o � t�tulo").equals("<p>#N�o � t�tulo</p>"));
		// mais de tr�s n�veis � ignorado
		System.out.println(Markdown.toHTML("#### N�o � t�tulo").equals("<p>#### N�o � t�tulo</p>"));
		// ---------- ATEH AQUI 0.5
		System.out.println();
    // os formatos a seguir se aplicam mesmo dentro de t�tulos e par�grafos
	System.out.println(Markdown.toHTML("Um texto de *teste* it�lico.").equals("<p>Um texto de <em>teste</em> it�lico.</p>"));
    // s� funciona se dentro do marcador houver um n�o-espa�o
    System.out.println(Markdown.toHTML("Um texto de * teste* it�lico.").equals("<p>Um texto de * teste* it�lico.</p>"));
     System.out.println(Markdown.toHTML("Um texto de *teste * it�lico.").equals("<p>Um texto de *teste * it�lico.</p>"));
    System.out.println(Markdown.toHTML("Um texto de * teste * it�lico.").equals("<p>Um texto de * teste * it�lico.</p>"));
     // sem espa�os internos funciona, mesmo com uma frase
     System.out.println(Markdown.toHTML("Um texto de *teste em it�lico* com v�rias palavras.")
    		 .equals("<p>Um texto de <em>teste em it�lico</em> com v�rias palavras.</p>"));
     // meio aberto (ou fechado) � ignorado
     System.out.println(Markdown.toHTML("Um texto de *teste em it�lico com v�rias palavras.")
    		 .equals("<p>Um texto de *teste em it�lico com v�rias palavras.</p>"));

     // vale tudo para negrito
     System.out.println(Markdown.toHTML("Um texto de **teste em negrito** com v�rias palavras.")
    		 .equals("<p>Um texto de <strong>teste em negrito</strong> com v�rias palavras.</p>"));

     // hyperlinks da mesma maneira s� que com < e >
     System.out.println(Markdown.toHTML("Par�grafo com link para <http://google.com> de teste.")
    		 .equals("<p>Par�grafo com link para <a href=\"http://google.com\">http://google.com</a> de teste.</p>"));
     System.out.println(Markdown.toHTML("Par�grafo com link para < http://google.com> de teste.")
    		 .equals("<p>Par�grafo com link para < http://google.com> de teste.</p>"));
     // ATEH AQUI 1.0

/*
### Construir um BLOG m�nimo com Spark que fa�a uso de marca��o especial 2.3

S�o duas funcionalidades que ser�o descritas a seguir.

**Funcionalidade #1:** deve possuir um formul�rio para permitir a postagem. Apenas dois campos: t�tulo e texto. (1.0)

Cada post deve ser persistido com um n�mero gerado que deve sobreviver entre execu��es. O arquivo salvo, neste caso, 
deve ser um `TXT` e n�o um `CSV`.

Importante: deve validar evitando gravar posts com t�tulos com menos de 15 caracteres e textos com menos de 100.

A m�trica para receber 1.0 ponto � se estiver salvando posts recebe 0.3, 
e sendo apenas os v�lidos 0.5, no arquivo com o formato `TXT` contendo t�tulo e texto,
 numerado corretamente entre execu��es (ou seja, mesmo que se pare e reinicie o processo) vale 1.0.

**Funcionalidade #2:** deve apresentar na tela principal os posts
* (todos e na ordem inversa, ou seja, o �ltimo persistido deve aparecer primeiro) 
* formatados com convers�o Markdown para HTML. (1.3) Ou seja, um post com o texto:

    # Este � o t�tulo

    Lorem ipsum dolor sit amet, **consectetur adipiscing elit**. Duis lacinia aliquam eros, eget iaculis enim varius vitae. In ornare eu lacus eu lobortis. 

    In tempus felis a malesuada tincidunt. Fusce egestas ante sed euismod ornare. Suspendisse porttitor ultricies magna eget commodo. Cras mattis luctus porttitor. Ut ornare convallis ligula, eu porttitor tellus sollicitudin eu. Nunc malesuada est et porta volutpat.

Deve tornar-se o HTML:

    <h1>Este � o t�tulo</h1>

    <p>Lorem ipsum dolor sit amet, <strong>consectetur adipiscing elit</strong>. Duis lacinia aliquam eros, eget iaculis enim varius vitae. In ornare eu lacus eu lobortis.</p>

    <p>In tempus felis a malesuada tincidunt. Fusce egestas ante sed euismod ornare. Suspendisse porttitor ultricies magna eget commodo. Cras mattis luctus porttitor. Ut ornare convallis ligula, eu porttitor tellus sollicitudin eu. Nunc malesuada est et porta volutpat.</p>

A m�trica para avalia��o �:

- Apresentou os posts (0.7)
- Apresentou os posts na ordem inversa (1.0)
- Apresentou usando a convers�o Markdown/HTML (1.3)
*/
}}
