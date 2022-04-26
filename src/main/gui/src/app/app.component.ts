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

  selectedLocation: string;

  list: boolean = false;

  constructor(private regionService : RegionService) {}

  ngOnInit() {
    this.selectedLocation = "";
  }

  async listLocals(selectedLocation: string) {

    console.log("Location: " + selectedLocation);
    await this.regionService.getRegionLocations(selectedLocation)
      .subscribe({
        next: (locs: Local[]) => this.locations = locs
      });
    if (this.locations) {
      this.list = true;
      this.selectedLocation = "";
    }
  }
}
