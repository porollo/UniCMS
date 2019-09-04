import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Articles} from "../../models/article/article";
import {Observable} from "rxjs";

@Injectable()
export class ArticlesService {

  private articlesUrl: string;

  constructor(private http: HttpClient) {
    this.articlesUrl = 'http://localhost:9090/articles';
  }

  public findAll(): Observable<Articles[]> {
    return this.http.get<Articles[]>(this.articlesUrl);
  }

  public save(articles: Articles) {
    return this.http.post<Articles>(this.articlesUrl, articles);
  }
}
