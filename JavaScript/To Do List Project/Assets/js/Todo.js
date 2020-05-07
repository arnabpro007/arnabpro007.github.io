//Check Off Specific Todos by Clicking
$("ul").on("click","li",function(){
	$(this).toggleClass("completed");
});

//Click on X to Delete todo
$("ul").on("click","span",function(event){
	$(this).parent().fadeOut(500,function(){
		$(this).remove();
	});
	event.stopPropagation();

});

$("input[type='text']").keypress(function(event){
	if (event.which === 13) {
		//grabbing new todo
		var todoText = $(this).val();
		$(this).val("");
		//creating new li
		$("ul").append("<li><span><i class='fa fa-trash'></i></span> "+todoText+"</li>");

	}


});



$(".test").click(function(){
	$("input[type='text']").fadeToggle();
});
