import { Component, OnInit } from '@angular/core';
import {Settings} from "../../../models/settings/settings";
import {ActivatedRoute, Router} from "@angular/router";
import {SettingsService} from "../../../services/settings/settings.service";

@Component({
  selector: 'app-settings-form',
  templateUrl: './settings-form.component.html',
  styleUrls: ['./settings-form.component.css']
})

export class SettingsFormComponent {

  settings: Settings;

  constructor(private route: ActivatedRoute, private router: Router, private settingsService: SettingsService) {
    this.settings = new Settings();
  }

  onSubmit() {
    this.settingsService.save(this.settings).subscribe(result => this.gotoSettingsList());
  }

  gotoSettingsList() {
    this.router.navigate(['/settings']);
  }
}

