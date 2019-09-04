import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Settings} from "../../models/settings/settings";
import {Observable} from "rxjs";

@Injectable()
export class SettingsService {

  private settingsUrl: string;

  constructor(private http: HttpClient) {
    this.settingsUrl = 'http://localhost:9090/settings';
  }

  public findAll(): Observable<Settings[]> {
    return this.http.get<Settings[]>(this.settingsUrl);
  }

  public save(settings: Settings) {
    return this.http.post<Settings>(this.settingsUrl, settings);
  }
}
