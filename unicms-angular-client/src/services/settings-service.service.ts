import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {Settings} from "../models/settings";

@Injectable()
export class SettingsService {

  private settingsUrl: string;

  constructor(private http: HttpClient) {
    this.settingsUrl = 'http://localhost:8080/settings';
  }

  public findAll(): Observable<Settings[]> {
    return this.http.get<Settings[]>(this.settingsUrl);
  }

  public save(settings: Settings) {
    return this.http.post<Settings>(this.settingsUrl, settings);
  }
}
