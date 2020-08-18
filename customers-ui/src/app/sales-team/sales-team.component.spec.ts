import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesTeamComponent } from './sales-team.component';

describe('SalesTeamComponent', () => {
  let component: SalesTeamComponent;
  let fixture: ComponentFixture<SalesTeamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SalesTeamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SalesTeamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
