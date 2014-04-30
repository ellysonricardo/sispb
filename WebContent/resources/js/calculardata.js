function Dia(Data_DDMMYYYY) {
		string_data = Data_DDMMYYYY.toString();
		posicao_barra = string_data.indexOf("/");
		if (posicao_barra != -1) {
			dia = string_data.substring(0, posicao_barra);
			return dia;
		}
	}

	function Mes(Data_DDMMYYYY) {
		string_data = Data_DDMMYYYY.toString();
		posicao_barra = string_data.indexOf("/");
		if (posicao_barra != -1) {
			dia = string_data.substring(0, posicao_barra);
			string_mes = string_data.substring(posicao_barra + 1,
					string_data.length);
			posicao_barra = string_mes.indexOf("/");
			if (posicao_barra != -1) {
				mes = string_mes.substring(0, posicao_barra);
				return mes;
			}
		}
	}

	function Ano(Data_DDMMYYYY) {
		string_data = Data_DDMMYYYY.toString();

		posicao_barra = string_data.indexOf("/");

		if (posicao_barra != -1) {
			dia = string_data.substring(0, posicao_barra);
			string_mes = string_data.substring(posicao_barra + 1,
					string_data.length);
			posicao_barra = string_mes.indexOf("/");
			if (posicao_barra != -1) {
				mes = string_mes.substring(0, posicao_barra);
				mes = Math.floor(mes);
				ano = string_mes
						.substring(posicao_barra + 1, string_mes.length);
				return ano;
			}
		}
	}

	function seta_periodo() {
		var data1_DDMMYYYY = document.getElementById('dataEntrada').value;
		var data2_DDMMYYYY = document.getElementById('dataSaida').value;
		var totalAPagar = document.getElementById('valorDiaria').value;
		var deposito = document.getElementById('valorDeposito').value;
		

		Var_Dia1 = Dia(data1_DDMMYYYY);
		Var_Mes1 = Mes(data1_DDMMYYYY);
		Var_Ano1 = Ano(data1_DDMMYYYY);
		Var_Dia2 = Dia(data2_DDMMYYYY);
		Var_Mes2 = Mes(data2_DDMMYYYY);
		Var_Ano2 = Ano(data2_DDMMYYYY);

		var data1 = new Date(Var_Ano1, (Var_Mes1) - (1), Var_Dia1);
		var data2 = new Date(Var_Ano2, (Var_Mes2) - (1), Var_Dia2);
		var diferenca = data2.getTime() - data1.getTime();
		var total = diferenca  / (1000 * 60 * 60 * 24);
		document.checkout.numeroDias.value = total  ;
		document.checkout.valorTotal.value = deposito - (total * totalAPagar) ;
	}
	
	function somarValor() {
		var DiasAPagar = document.getElementById('numeroDias').value;
		var totalAPagar = document.getElementById('valorDiaria').value;
		
		document.checkout.valorTotal.value = DiasAPagar * totalAPagar ;
	}
