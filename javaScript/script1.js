function btnService(id,obj){
	//document.getElementById("btn"+id).value='클릭했군';
	//console.log(obj);
	//console.log(document.getElementById("d"+obj.id));
	if(obj.id=='btn1')
	document.getElementById("d"+obj.id).innerHTML="<input type='checkbox' name='ck' value='농구'>농구<input type='checkbox' name='ck' value='배구'>배구<input type='checkbox' name='ck' value='야구'>야구<input type='button' value='확인' onclick=checkShow(1)>";
	else
	document.getElementById("d"+obj.id).innerHTML="<input type='checkbox' name='food' value='짜장'>짜장<input type='checkbox' name='food' value='짬뽕'>짬뽕<input type='checkbox' name='food' value='유산슬'>유산슬<input type='button' value='확인' onclick=checkShow(2)>";	
		
}

function checkShow(index){
	var nodeList=document.getElementsByName(index==1?"ck":"food");
	for(var i=0;i<nodeList.length;i++){
		if(!nodeList[i].checked)continue;
		alert(nodeList[i].value);
	}
}

var showData = function(index) {
	var i = document.getElementsByTagName("p");
	var temp = '';
	switch (index) {
	case 1:
		temp = "슬기짱";
		break;
	case 2:
		temp = "지혜짱";
		break;
	case 3:
		temp = "승원짱";
		break;
	}
	for (var j = 0; j < i.length; j++) {
		i[j].innerHTML = "<b>" + temp + "</b>";
	}

}
/*function checkCount(){	
	var cnt=0;
	var nodeList=document.getElementsByName("ck5");
	for(var i=0;i<nodeList.length;i++){
		if(nodeList[i].checked)cnt++;
		
	}	
	if(cnt>3){
		alert('3개까지만...');
		clear(nodeList);	
		cnt=0;
	}
}*/
function clear(nodeList){
	for(var i=0;i<nodeList.length;i++){
		nodeList[i].checked=false;
	}
}
















