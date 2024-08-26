package Seguridad;

public class Password {
		private int longitud;
		private String password;
		//2 constructores, el primero admite solo contrasena, el otro modifica su longitud y contrasena
		
		public Password() {
			this.longitud = 10;
		}		
		public Password(int longitud) {
			this.longitud = longitud;
			password = generar();
		}
		// getters and setters construction
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getPassword() {
			return password;
		}
		
		//Metodo para la creacion de una contrasena
		public String generar() {
			int aux = 0;
			String Cadena = "";
			
			for(int i=0; i<longitud;i++) {
				aux = (int) (Math.floor(Math.random()*3)+1);
				switch(aux) {
				case 1:
						char minuscula = (char)((int) (Math.floor(Math.random()*(123-97))+97));
						Cadena += minuscula;
						break;
				case 2:
						char mayuscula = (char)((int) (Math.floor(Math.random()*(91-65))+65));
						Cadena += mayuscula;
						break;
				default:
						char numeros = (char)(int) (Math.floor(Math.random()*(57-48))+48);
						Cadena += numeros;
						break;
				}
			}
			this.password = Cadena;
			return password;
		}

		//Metodo para validar la contrasena
		public void validar() {
			int acumMayus = 0 ;
			int acumMinus = 0 ;
			int acumNum = 0;
			for(int h=0; h<password.length();h++) {
				if(password.charAt(h)>= 97  && password.charAt(h)< 123) {
					acumMayus++;
				}else if(password.charAt(h)>= 65  && password.charAt(h)< 97) {
					acumMinus++;
				}else {
					acumNum++;
				}
			}
			
			if(acumNum>=5 && acumMinus>=1 && acumMayus>=2 ) {
				System.out.println("La contrasena es segura");
			}else {
				System.out.println("La contrasena no es segura");
			}
			
		}
}
