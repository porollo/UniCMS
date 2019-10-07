import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './components/user/user-list/user-list.component';
import { UserFormComponent } from './components/user/user-form/user-form.component';
import { UserService } from './services/user/user.service';
import { IndexComponent } from './components/index/index.component';
import { SettingsListComponent } from './components/settings/settings-list/settings-list.component';
import { SettingsFormComponent } from './components/settings/settings-form/settings-form.component';
import {SettingsService} from "./services/settings/settings.service";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    IndexComponent,
    SettingsListComponent,
    SettingsFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule
  ],
  providers: [
    UserService,
    SettingsService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }

