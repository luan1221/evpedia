import { Component } from '@angular/core';
import {RegionService} from "./services/region.service";
import {Local} from "./models/Local";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  locations: Local[] = [];

  locTest: Local;

  list: boolean = false;

  constructor(private regionService : RegionService) {
    this.locTest = new Local();
  }

  async ngOnInit() {
    await this.regionService.getRegionLocations()
      .subscribe({
        next: (locs: Local[]) => this.locations = locs
      });
    console.log(this.locTest);
    console.log(this.locations);
    this.locTest = this.locations[0];
    console.log("LocTest: " + this.locTest);
  }

  listLocals(): void {
    this.list = true;
  }
}
