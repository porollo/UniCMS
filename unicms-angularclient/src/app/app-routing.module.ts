import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './components/user/user-list/user-list.component';
import { UserFormComponent } from './components/user/user-form/user-form.component';
import {SettingsFormComponent} from "./components/settings/settings-form/settings-form.component";
import {SettingsListComponent} from "./components/settings/settings-list/settings-list.component";

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'adduser', component: UserFormComponent },
  { path: 'deleteuser', component: UserFormComponent },
  { path: 'settings', component: SettingsListComponent },
  { path: 'addsetting', component: SettingsFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
