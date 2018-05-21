<?php
	$listaTelefonica = array("74999999999", "718888888", "813333333", "87555555555", "73444444444");;
	$listaEstados = array();
	$listaEstados['ba']=0;
	$listaEstados['pe']=0;

	foreach ($listaTelefonica as $telefone){
		if(substr($telefone, 0,2)) == '74' || substr($telefone, 0,2)) == '73' || substr($telefone, 0,2)) == '71' || substr($telefone, 0,2)) == '77'){
				$listaEstados['ba']++;
			}
		else if(substr($telefone, 0,2)) == '87' || substr($telefone, 0,2)) == '81'){
			$listaEstados['pe']++;
		}
	}
	print_r($listaEstados);
?>