import { Routes } from '@angular/router';
import { Welcome } from './welcome/welcome';
import { Hello } from './hello/hello';

export const routes: Routes = [
					{path:'hello', component:Hello},
					{path:'welcome', component:Welcome}
				];
