import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Observable } from "rxjs";
import { retry, map } from "rxjs/operators";
import {Local} from "../models/Local";

@Injectable({
  providedIn: 'root'
})
export class RegionService {

  private url = "http://localhost:8080";
  private headers = new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private client : HttpClient) {}

  getRegionLocations(): Observable<Local[]> {
    return this.client.get<Local[]>(`${this.url}/regions/region`)
      .pipe(
        retry(2)
      );
  }

}
