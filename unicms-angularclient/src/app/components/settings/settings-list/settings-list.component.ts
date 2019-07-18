import { Component, OnInit } from '@angular/core';
import {Settings} from "../../../models/settings/settings";
import {SettingsService} from "../../../services/settings/settings-service.service";

@Component({
  selector: 'app-settings-list',
  templateUrl: './settings-list.component.html',
  styleUrls: ['./settings-list.component.css']
})

export class SettingsListComponent implements OnInit {

  users: Settings[];

  constructor(private settingsService: SettingsService) {
  }

  ngOnInit() {
    this.settingsService.findAll().subscribe(data => {
      this.settings = data;
    });
  }
}
