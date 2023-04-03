
/*
 * Método para carregamento da página 1
 *
 * */

$(document).ready(function(){

	var meses = ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'];
	
	
//	var meses = [  
//				
//	/*[[${mes[0]}]]*/,/*[[${mes[1]}]]*/,/*[[${mes[3]}]]*/,/*[[${mes[4]}]]*/,/*[[${mes[5]}]]*/,
//	/*[[${mes[6]}]]*/,/*[[${mes[7]}]]*/,/*[[${mes[8]}]]*/,/*[[${mes[9]}]]*/,/*[[${mes[10]}]]*/,
//	/*[[${mes[11]}]]*/			
//		 
//	]; 
	
	
	var index = 1;
	var anterior = $('#botao-anterior');
	var mesAtual = $('.mes-atual');
	var proximo = $('#botao-proximo');


	mesAtual.text(meses[1]);
	
	
	/**
	 * Função de evendo de click do botão de id botao-proximo. Realiza a leitura do 
	 * array com limites da primeira até a décima-primeira posição. Verifica qual
	 * a posição e, ao clicar avança para a próxima posição, caso atinja a última 
	 * posição o botão é desabilitado dando a impressão de limite máximo.
	 * 
	 */
	proximo.click(function(){
		
	 
		
		if(index +1 == meses.slice(0,11)){
			index;
		} else {
			index = index + 1;
			
			// Código de carregar o calendário aqui !!!
			
		 				 
			
			anterior.prop('disabled', false);						
			if(index == 11) {
				proximo.attr('disabled', 'disabled')
			}				
		}		
		mesAtual.text(meses[index]);		
	})
	
	
	
	/**
	 * Função de evendo de click do botão de id botao-aterior. Realiza a leitura da 
	 * posição atual do array e, ao clicar retrocede para a posição anterior do array, 
	 * caso atinja a primeira posição o botão é desabilitado dando a impressão de limite 
	 * mínimo.
	 * 
	 */
	anterior.click(function(){ 
		
		if(index -1 == meses.length) {
			index = 11;
		} else {
			index = index - 1;
			
			// Código de carregar o calendário aqui !!!
			
			
			
				proximo.prop('disabled', false);
			if(index == 0){
				anterior.attr('disabled', 'disabled');				
			}			
		}		
		mesAtual.text(meses[index]);
		
	
	})
	
	

  
  let i;
  
  // lógica para carregar de acordo com a dia do mes e a data
//  	$('#ul-calendario').append("<li class= 'dia-li''></li>");
//  	$('#ul-calendario').append("<li class= 'dia-li''></li>");
//  	$('#ul-calendario').append("<li class= 'dia-li''></li>");
  	
  	
	
  // carregamento das datas
//  for(i = 1; i <= 31; i++) {  
//	  
//	 $('#ul-calendario').append("<li class= 'dia-li' id='dia-"+i+"'>"+i+"</li>");	
//	   
//  }
  
  // janeiro = 31 dias
  // fevereiro = 28 dias
  // fevereiro bixesto = 29 dias
  // março  = 31 dias
  // abril  = 30 dias
  // maio  = 31 dias
  // junho   = 30 dias
  // julho  = 31 dias
  // agosto   = 31 dias
  // setembro  = 30 dias
  // outubro  = 31 dias
  // novembro  = 30 dias
  // dezembro = 31 dias
  
  
  
  
  
   // carregamento dos eventos
   $('#dia-1').hover(function(){
	   $(this).css("background-color","pink");
   })
   
   if(index == 2) {
		$('#dia-2').text("Mes de Março")
	}

 
})



