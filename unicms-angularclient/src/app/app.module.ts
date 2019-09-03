import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './components/user/user-list/user-list.component';
import { UserFormComponent } from './components/user/user-form/user-form.component';
import { UserService } from './services/user/user.service';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { IndexComponent } from './components/index/index.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { SettingsListComponent } from './components/settings/settings-list/settings-list.component';
import { SettingsFormComponent } from './components/settings/settings-form/settings-form.component';
import {SettingsService} from "./services/settings/settings.service";
import { InstallMainComponent } from './components/install/install-main.component';
import { SelectBackendComponent } from './components/install/select-backend/select-backend.component';
import { SelectDatabaseComponent } from './components/install/select-database/select-database.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    NavbarComponent,
    FooterComponent,
    IndexComponent,
    SidebarComponent,
    SettingsListComponent,
    SettingsFormComponent,
    InstallMainComponent,
    SelectBackendComponent,
    SelectDatabaseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    UserService,
    SettingsService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }

