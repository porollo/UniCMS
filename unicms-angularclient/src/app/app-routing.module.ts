import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './components/user/user-list/user-list.component';
import {SettingsFormComponent} from "./components/settings/settings-form/settings-form.component";
import {SettingsListComponent} from "./components/settings/settings-list/settings-list.component";
import {UserEditComponent} from "./components/user/user-edit/user-edit.component";

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'user-add', component: UserEditComponent},
  { path: 'user-edit/:id', component: UserEditComponent},
  { path: 'settings', component: SettingsListComponent },
  { path: 'addsetting', component: SettingsFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
