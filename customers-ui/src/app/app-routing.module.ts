import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SalesTeamComponent} from "./sales-team/sales-team.component";

const routes: Routes = [{path: 'sales', component: SalesTeamComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
