import { Component, OnInit } from '@angular/core';
import { Salesman } from './salesman';
import { SalesTeam } from './mock-sales-team';

@Component({
  selector: 'app-sales-team',
  templateUrl: './sales-team.component.html',
  styleUrls: ['./sales-team.component.sass']
})
export class SalesTeamComponent implements OnInit {

  salesmanTeam = SalesTeam;

  // salesmanTeam: Salesman = {
  //   id: 1,
  //   name: 'Windstorm'
  // };

  constructor() { }

  ngOnInit(): void {
  }

}
