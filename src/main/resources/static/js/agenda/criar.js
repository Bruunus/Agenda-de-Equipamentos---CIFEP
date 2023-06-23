// Sessão de variáveis do formulário 

// Pertencentes ao formulário 
var marcacaoAnual = $('#marcacao-anual');
var checkbox_form_personalizado = $('#marcacao-personalizado');
var campoMostrarReservas = $('#mostrarReservas');                   // ja deixei aqui caso precise
var botaoOutroEquipamento = $('#btnAdicionarOutro');      // botão 'Outro Equipamento'
var areaCaixaDeTextoFormulario = $('#areaCaixaDeTextoAddOutroEquipamento')
const select_form_personalizado = $('#caixa-de-selecao-personalizado');     // para caixa de seleção Opções
const div_teste = $('.sessao-dia');
var selectEquipamentos = document.querySelector('#select-equipamentos');    // select para adicionar equipamento no JSON
var selectQuantidade = document.querySelector('#quantidadeDeItem');         // select para adicionar quantidade de item no JSON
var botaoAdicionarEquipamento = document.querySelector('#botaoAdicionarEquipamento');   // span como button do html
var valorCaixa = $('#caixaDeTextOutroEquipamento');
var valorSelect;

let jsonItens = [];                 // JSON para envio de equipamento
let jsonQuantidade = [];            // JSON de quantidade para envio da quantidade







// Sessão de criação de DOM

// Criando barra de texto input text de 'Outro Equipamento'
var caixaDeTextoAddOutroEquipamento = $('<input>')
    .attr('type','text')
    .attr('id','caixaDeTextOutroEquipamento')
    .attr('maxlength','40')
    .css('height', '1.5em')
    .css('margin-left','1.5em')
    .css('margin-right','-10px')
    .hide();
    

// Criando um select para definir a quantidade 
    var selectQtdOutroEquipamento = $('<select>');

    selectQtdOutroEquipamento
        .css('margin-left','1em')
        .attr('id','selectQtdOutroEquipamento');

    selectQtdOutroEquipamento.append('<option value=""></option>');
    selectQtdOutroEquipamento.append('<option value="1">1</option>');
    selectQtdOutroEquipamento.append('<option value="2">2</option>');
    selectQtdOutroEquipamento.append('<option value="3">3</option>');
    selectQtdOutroEquipamento.hide();

// criando um botao para adicionar as informações do input e select de
// outro equipamento
    var botaoAdicionarOutroElemento = $('<span>')
        .text('Adicionar')
        .css('background-color','lightblue')
        .css('padding','0.2em 0.5em')
        .css('margin-left','0.3em')
        .css('border','0.5px solid gray')
        .css('border-radius','4px')
        .attr('tabindex', '0')
        .css({
            '-webkit-touch-callout': 'none',
            '-webkit-user-select': 'none',
            '-khtml-user-select': 'none',
            '-moz-user-select': 'none',
            '-ms-user-select': 'none',
            'user-select': 'none'
          })
        .hide();

        botaoAdicionarOutroElemento.hover(
            function() {
              // Código a ser executado quando o mouse entra no elemento (hover)
              $(this)
                .css('background-color', 'rgb(169, 211, 224)')
                .css('cursor','pointer');

            },
            function() {
              // Código a ser executado quando o mouse sai do elemento (hover out)
              $(this).css('background-color', 'lightblue');
            }
          );

    


// Adicionando ao HTML (em ordem de posição)
    areaCaixaDeTextoFormulario.append(caixaDeTextoAddOutroEquipamento);      // add ao HTML
    areaCaixaDeTextoFormulario.append(selectQtdOutroEquipamento); 
    areaCaixaDeTextoFormulario.append(botaoAdicionarOutroElemento);
 




    

 
// Manipulação do DOM de elementos criados
   









/**
 * Carregamento da página total
 */
$(document).ready(function () {
    


    
    /**
     * Propriedade do Datapicker
     */
    var datepicker =  $('.datepicker')
    datepicker.datepicker({
      language: "pt-br",
      autoclose: true,
      format: "dd/mm/yyyy"
    });
  






    /*************** Funções Change (Mudança de opções)***************/
  
  
    
    /**  
     * Função para habilitar / desabilitar caixa de seleção atraves do
     * checkbox Anual
    */
    marcacaoAnual.change(function(){
    if ($(this).is(':checked')) {
        $('#caixa-de-selecao-anual').prop('disabled', false);
    } else {
        $('#caixa-de-selecao-anual').prop('disabled', true);
    }
    })
  
  



    /**
     * Função para habilitar / desabilitar caixa de seleção através do 
     * checkbox Opções
     */
    checkbox_form_personalizado.change(function() {

        if(this.checked) {

            select_form_personalizado.prop('disabled', false);

            switch (this.value) {
                case 'dia':
                    div_teste.show();
                    console.log('Carregado')
                    break;
                
                case 'semana':
                    div_teste.hide();
                    alert('Escutado select Semana');
                    break;
    
                case 'mes':
                    div_teste.hide();
                    alert('Escutado select Mês')
                    break;
    
                default:
                    div_teste.hide();
                    break;
            }

        } else {
            select_form_personalizado.prop('disabled', true)
        }
    })

   
  
  });




  /*************** Funções Compartilhadas (Se aproveitam da mesma lógica)***************
   

    /**
     * Função para adicionar Outro equipamento em excessão que não está
     * na lista normalizada - Esta função está compartilhada com a função 
     * de keypress que fará o mesmo objetivo pelo teclado.
     */
    function adicionarOutroEquipamentoExcessao () {
    valorCaixa = $('#caixaDeTextOutroEquipamento').val();
    valorSelect = $('#selectQtdOutroEquipamento').val();  

    console.log(valorCaixa);
    console.log(valorSelect);

    $('#caixaDeTextOutroEquipamento').val('');
    $('#selectQtdOutroEquipamento').prop('selectedIndex', 0);
    

    exibirPreReserva(valorCaixa, valorSelect,"(Não listado)");
    
    }
    // Parte do teclado
    botaoAdicionarOutroElemento.on('keypress', function(event){
        if (event.keyCode === 13 || event.key === 'Enter' || event.code === 'Enter') {
            adicionarOutroEquipamentoExcessao();
        }
    })
    // Parte do mouse
    botaoAdicionarOutroElemento.on('click', adicionarOutroEquipamentoExcessao);

  



 
    


    /** FUNÇÃO
     * Evento para adicionar equipamentos do formulário. O item do objeto é 
     * escolhido ao seleciona-lo no formulário - Esta função está compartilhada com a função 
     * de keypress que fará o mesmo objetivo pelo teclado.
     */

    function adicionarEquipamento () {

        const opValueSelectEquipamentos = selectEquipamentos.options[selectEquipamentos.selectedIndex].value;
        const valorSelecionadoeEquipamentos = opValueSelectEquipamentos;

        const opValueSelectQuantidade = selectQuantidade.options[selectQuantidade.selectedIndex].value;
        const valorSelecionadoQuantidade = opValueSelectQuantidade;


        console.log(valorSelecionadoeEquipamentos);


        // validação dos select's aqui ! Antes do push
        jsonItens.push(valorSelecionadoeEquipamentos);
        jsonQuantidade.push(valorSelecionadoQuantidade);

        console.log(jsonItens +" "+ jsonQuantidade);

        selectEquipamentos.selectedIndex = 0;
        selectQuantidade.selectedIndex = 0;

        exibirPreReserva(valorSelecionadoeEquipamentos, valorSelecionadoQuantidade,"");

    }

    botaoAdicionarEquipamento.addEventListener('keypress', function(event){
        if (event.keyCode === 13 || event.key === 'Enter' || event.code === 'Enter') {
            adicionarEquipamento();
        }
    })

    botaoAdicionarEquipamento.addEventListener('click', adicionarEquipamento);







    /**
     * Função para exibir input text, select e um button para adiciona
     * as propriedades de outro equipamento quando preciso. Os elementos
     * ficam ocultos na renderização e, ao clicar no botão são exibidos.
     */
    function ocultarMostrarFormaAddOutroEquipamento() {
        

        $(this).css('margin-left','7px')
        if (caixaDeTextoAddOutroEquipamento.is(':hidden')) {
            // Se as informações estiverem ocultas, exiba-as
            caixaDeTextoAddOutroEquipamento.show();
            selectQtdOutroEquipamento.show();
            botaoAdicionarOutroElemento.show();
        } else {
            // Se as informações estiverem visíveis, oculte-as
            caixaDeTextoAddOutroEquipamento.hide();
            selectQtdOutroEquipamento.hide();
            botaoAdicionarOutroElemento.hide();
        }
    }
    botaoOutroEquipamento.on('keypress', function(event){
        if (event.keyCode === 13 || event.key === 'Enter' || event.code === 'Enter') {
            ocultarMostrarFormaAddOutroEquipamento();
        }
    })

    botaoOutroEquipamento.on('click', ocultarMostrarFormaAddOutroEquipamento);






    /** JQUERY
     * Função para exibir os equipamento pré-adicionados na reserva. A cada
     * click e ao adicionar uma reserva essa função é chamada e exibida na
     * área de pré-reserva 
     */
    function exibirPreReserva(equipamento, quantidade, mensagem) {
        var mostrar = campoMostrarReservas.append(equipamento +" "+quantidade+" "+mensagem);
    }
    // Javascript - Código duplicado










  

  /** FUNÇÃO
   * Processador do formulário de criar reserva. Enviando os dado via JSON para 
   * o servidor
   */
  document.getElementById('btn_form').addEventListener('click', function(e) {
    e.preventDefault();

    // Sessão de variáveis locais
    var collaborator = document.getElementById('colaborador').value;
    var sector = document.getElementById('setor').value;
    var bookingDate = moment(document.getElementById('dataDaReserva').value, 'DD/MM/yyyy').format('yyyy-MM-DD');
    var endDateOfBook = moment(document.getElementById('dataFimDaReserva').value, 'DD/MM/yyyy').format('yyyy-MM-DD');
    var startPeriod = document.getElementById('periodoInicio').value;
    var endPeriod = document.getElementById('periodoFim').value;

     
    
    
    /**
     * Validação para o campo select Recorrência Anual e
     * validação para o campo select recorrência opções
     */
    if (marcacaoAnual.is(':checked')) {
        var annualAppointment = document.getElementById('caixa-de-selecao-anual').value;
    }
    
    if(checkbox_form_personalizado.is(':checked')) {
        var recurrenceOptions = document.getElementById('caixa-de-selecao-personalizado').value;
    }
    
    



    /**
     * JSON modelo esperado no controller
     */
    var reservasDTO = {
        colaborador: collaborator,
        setor: sector,
        dataDaReserva : bookingDate,
        dataFimDaReserva : endDateOfBook,
        periodoInicio : startPeriod,
        periodoFim : endPeriod,
        opcaoDiaAnual : annualAppointment,
        opcoesDeRecorrenciaItem : recurrenceOptions,
        equipamentosSelecionados: jsonItens,
        quantidadeDeItem : jsonQuantidade,
        outrosEquipamentos : valorCaixa,
        qtdOutroEquipamento : valorSelect
    };

   


    console.log(
        'Nome: ' + collaborator + "\n" +
        'Setor: ' + sector +"\n"+
        'Data da reserva: ' + bookingDate +"\n" +
        'Data fim da reserva: ' + endDateOfBook +"\n" +
        'Período de inicio: ' + startPeriod +"\n" +
        'Período Fim: ' + endPeriod +"\n" +
        'Recorrência Anual: ' + annualAppointment +"\n" +
        'Recorrência?: ' + recurrenceOptions +"\n" +
        'Equipamentos: ' + reservasDTO.equipamentosSelecionados +"\n" +
        'Quantidade: ' + reservasDTO.quantidadeDeItem +"\n" +
        'Outro Equipamento: ' + valorCaixa +"\n" +
        'Quantidade: ' + valorSelect
    );
    
    
    
    
    
   

    

    
    


    var jsonData = JSON.stringify(reservasDTO);
  

    var xhr = new XMLHttpRequest();
    xhr.open('POST','/reserva/criar-js');
    xhr.setRequestHeader('Content-Type', 'application/json');

    xhr.onload = function() {
        if (xhr.status === 200) {
            console.log('Reserva enviada com sucesso!');
        } else {
            console.error('Ocorreu um erro ao enviar a reserva.');
        }
    };

    xhr.send(jsonData);


      

});


