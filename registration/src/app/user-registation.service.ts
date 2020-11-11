import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserRegistationService {

  constructor(private http:HttpClient) { }


  public doRegistration(user) {
    console.log(user)
    return this.http.post("http://localhost:8085/register",user);
  }

  public getUsers(){
    return this.http.get("http://localhost:8085/getAllUsers");
  }

  public getUserByEmail(email){
    return this.http.get("http://localhost:8085/findUser/"+email);
  }

  public deleteUser(id){
    return this.http.delete("http://localhost:8085/cancel/"+id);
  }
}
