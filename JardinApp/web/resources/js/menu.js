$(document).ready(main);

var contador = 1;

function main() {
	$('.div-menu').click(function(){
		//$('.MainMenu').toggle();

		if(contador == 1) {
			$('.MainMenu').animate({
				top:'0'
			});
			contador = 0;
		} else {
			contador = 1;
			$('.MainMenu').animate({
				top:'-100%'
			});
		}
	})
}