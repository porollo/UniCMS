import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './components/user/user-list/user-list.component';
import { UserFormComponent } from './components/user/user-form/user-form.component';
import { UserService } from './services/user/user.service';
import { SettingsListComponent } from './components/settings/settings-list/settings-list.component';
import { SettingsFormComponent } from './components/settings/settings-form/settings-form.component';
import {SettingsService} from "./services/settings/settings.service";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MainNavComponent } from './components/main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { RouterModule, Routes } from '@angular/router';
import { CommentsListComponent } from './components/comments/comments-list/comments-list.component';
import { ArticlesListComponent } from './components/articles/articles-list/articles-list.component';

const appRoutes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'settings', component: SettingsListComponent },
  { path: 'articles', component: ArticlesListComponent },
  { path: 'comments', component: CommentsListComponent },
  {
    path: 'dashboard',
    component: DashboardComponent,
    data: { title: 'Dashboard' }
  },
];

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    SettingsListComponent,
    SettingsFormComponent,
    MainNavComponent,
    DashboardComponent,
    CommentsListComponent,
    ArticlesListComponent,
  ],
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true }  // <-- debugging purposes only
    ),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule
  ],
  providers: [
    UserService,
    SettingsService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }

